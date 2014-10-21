package models;


import helper.datasources.MorphiaObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Reference;
import play.data.format.Formats;

import java.util.Date;

@Entity
public class TokenAction {

	public enum Type {
		EMAIL_VERIFICATION,
		PASSWORD_RESET
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Verification time frame (until the user clicks on the link in the email)
	 * in seconds
	 * Defaults to one week
	 */
	private final static long VERIFICATION_TIME = 7 * 24 * 3600;

	@Id
	public ObjectId id;

	@Indexed(unique = true)
	public String token;

	@Reference
	public User targetUser;

	public Type type;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date created;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date expires;

	public static TokenAction findByToken(final String token, final Type type) {
		return MorphiaObject.datastore.createQuery(TokenAction.class)
				.filter("token", token)
				.filter("type",type)
				.get();
	}

	public static void deleteByUser(final User u, final Type type) {
		MorphiaObject.datastore.delete(
				MorphiaObject.datastore.createQuery(TokenAction.class)
					.filter("targetUser", u)
					.filter("type", type)
		);
	}

	public boolean isValid() {

		return this.expires.after(new Date());
	}

	public static TokenAction create(final Type type, final String token,
									 final User targetUser) {
		final TokenAction ta = new TokenAction();
		ta.targetUser = targetUser;
		ta.token = token;
		ta.type = type;
		final Date created = new Date();
		ta.created = created;
		ta.expires = new Date(created.getTime() + VERIFICATION_TIME * 1000);
		MorphiaObject.datastore.save(ta);
		return ta;
	}
}
