package models;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthUser;
import com.feth.play.module.pa.user.*;
import helper.datasources.MorphiaObject;
import models.TokenAction.Type;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.query.Query;
import play.data.format.Formats;
import play.data.validation.Constraints;

import java.util.*;

/**
 * Initial version based on work by Steve Chaloner (steve@objectify.be) for
 * Deadbolt2
 */
@Entity
public class User implements Subject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public ObjectId id;

	@Constraints.Email
	// if you make this unique, keep in mind that users *must* merge/link their
	// accounts then on signup with additional providers
	// @Column(unique = true)
	public String email;

	public String name;
	
	public String firstName;
	
	public String lastName;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date lastLogin;

	public boolean active;

	public boolean emailValidated;

	@Embedded
	public List<SecurityRole> roles = new ArrayList<SecurityRole>();

	@Embedded
	public List<LinkedAccount> linkedAccounts = new ArrayList<LinkedAccount>();

	@Embedded
	public List<UserPermission> permissions = new ArrayList<UserPermission>();

	@Override
	public String getIdentifier()
	{
		return id.toString();
	}

	@Override
	public List<? extends Role> getRoles() {

		return roles;
	}

	@Override
	public List<? extends Permission> getPermissions() {

		return permissions;
	}

	public List<UserPermission> getUserPermissions() {
		return permissions;
	}

	public List<LinkedAccount> getLinkedAccounts() {
		return linkedAccounts;
	}

	public static boolean existsByAuthUserIdentity(final AuthUserIdentity identity) {
		final Query<User> exp;
		if (identity instanceof UsernamePasswordAuthUser) {
			exp = getUsernamePasswordAuthUserFind((UsernamePasswordAuthUser) identity);
		} else {
			exp = getAuthUserFind(identity);
		}
		return exp.countAll() > 0;
	}

	private static Query<User> getAuthUserFind(
			final AuthUserIdentity identity) {
		return MorphiaObject.datastore.createQuery((User.class)).filter("active =", true)
				.filter("linkedAccounts.providerUserId", identity.getId())
				.filter("linkedAccounts.providerKey", identity.getProvider());
	}

	public static User findByAuthUserIdentity(final AuthUserIdentity identity) {
		if (identity == null) {
			return null;
		}
		if (identity instanceof UsernamePasswordAuthUser) {
			return findByUsernamePasswordIdentity((UsernamePasswordAuthUser) identity);
		} else {
			return getAuthUserFind(identity).get();
		}
	}

	public static User findByUsernamePasswordIdentity(
			final UsernamePasswordAuthUser identity) {
		return getUsernamePasswordAuthUserFind(identity).get();
	}

	private static Query<User> getUsernamePasswordAuthUserFind(
			final UsernamePasswordAuthUser identity) {
		return getEmailUserFind(identity.getEmail())
				.filter("linkedAccounts.providerKey", identity.getProvider());
	}

	public void merge(final User otherUser) {
		for (final LinkedAccount acc : otherUser.linkedAccounts) {
			this.linkedAccounts.add(LinkedAccount.create(acc));
		}
		// do all other merging stuff here - like resources, etc.

		// deactivate the merged user that got added to this one
		otherUser.active = false;
		MorphiaObject.datastore.save(otherUser);
		MorphiaObject.datastore.save(this);
	}

	public static User create(final AuthUser authUser) {
		final User user = new User();
		user.roles = Collections.singletonList(SecurityRole
				.findByRoleName(controllers.Application.USER_ROLE));
		// user.permissions = new ArrayList<UserPermission>();
		// user.permissions.add(UserPermission.findByValue("printers.edit"));
		user.active = true;
		user.lastLogin = new Date();
		user.linkedAccounts = Collections.singletonList(LinkedAccount
				.create(authUser));

		if (authUser instanceof EmailIdentity) {
			final EmailIdentity identity = (EmailIdentity) authUser;
			// Remember, even when getting them from FB & Co., emails should be
			// verified within the application as a security breach there might
			// break your security as well!
			user.email = identity.getEmail();
			user.emailValidated = false;
		}

		if (authUser instanceof NameIdentity) {
			final NameIdentity identity = (NameIdentity) authUser;
			final String name = identity.getName();
			if (name != null) {
				user.name = name;
			}
		}
		
		if (authUser instanceof FirstLastNameIdentity) {
		  final FirstLastNameIdentity identity = (FirstLastNameIdentity) authUser;
		  final String firstName = identity.getFirstName();
		  final String lastName = identity.getLastName();
		  if (firstName != null) {
		    user.firstName = firstName;
		  }
		  if (lastName != null) {
		    user.lastName = lastName;
		  }
		}

		MorphiaObject.datastore.save(user);

		// user.saveManyToManyAssociations("roles");
		// user.saveManyToManyAssociations("permissions");
		return user;
	}

	public static void merge(final AuthUser oldUser, final AuthUser newUser) {
		User.findByAuthUserIdentity(oldUser).merge(
				User.findByAuthUserIdentity(newUser));
	}

	public Set<String> getProviders() {
		final Set<String> providerKeys = new HashSet<String>(
				linkedAccounts.size());
		for (final LinkedAccount acc : linkedAccounts) {
			providerKeys.add(acc.providerKey);
		}
		return providerKeys;
	}

	public static void addLinkedAccount(final AuthUser oldUser,
			final AuthUser newUser) {
		final User u = User.findByAuthUserIdentity(oldUser);
		u.linkedAccounts.add(LinkedAccount.create(newUser));
		MorphiaObject.datastore.save(u);
	}

	public static void setLastLoginDate(final AuthUser knownUser) {
		final User u = User.findByAuthUserIdentity(knownUser);
		u.lastLogin = new Date();
		MorphiaObject.datastore.save(u);
	}

	public static User findByEmail(final String email) {
		return getEmailUserFind(email).get();
	}

	private static Query<User> getEmailUserFind(final String email) {
		return MorphiaObject.datastore.createQuery(User.class).filter("active", true)
				.filter("email", email);
	}

	public LinkedAccount getAccountByProvider(final String providerKey) {
		return LinkedAccount.findByProviderKey(this, providerKey);
	}

	public static void verify(final User unverified) {
		// You might want to wrap this into a transaction
		unverified.emailValidated = true;
		MorphiaObject.datastore.save(unverified);

		TokenAction.deleteByUser(unverified, Type.EMAIL_VERIFICATION);
	}

	public void changePassword(final UsernamePasswordAuthUser authUser,
			final boolean create) {
		LinkedAccount a = this.getAccountByProvider(authUser.getProvider());
		if (a == null) {
			if (create) {
				a = LinkedAccount.create(authUser);
			} else {
				throw new RuntimeException(
						"Account not enabled for password usage");
			}
		}
		a.providerUserId = authUser.getHashedPassword();
		this.linkedAccounts.add(a);
		MorphiaObject.datastore.save(this);
	}

	public void resetPassword(final UsernamePasswordAuthUser authUser,
			final boolean create) {
		// You might want to wrap this into a transaction
		this.changePassword(authUser, create);
		TokenAction.deleteByUser(this, Type.PASSWORD_RESET);
	}
}
