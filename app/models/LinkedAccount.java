package models;

import com.feth.play.module.pa.user.AuthUser;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@Entity
public class LinkedAccount {

	/**
	 * 
	 */
	@Id
	public ObjectId id;

	public String providerUserId;

	public String providerKey;

	public String getProviderKey() {
		return providerKey;
	}

	public void setProviderKey(String providerKey) {
		this.providerKey = providerKey;
	}

	public String getProviderUserId() {
		return providerUserId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}

	public static LinkedAccount findByProviderKey(final User user, String key) {
		List<LinkedAccount> accounts = user.getLinkedAccounts();

		for (LinkedAccount a : accounts) {
			if (a.providerKey.equalsIgnoreCase(key)) {
				return a;
			}
		}
		return null;
	}

	public static LinkedAccount create(final AuthUser authUser) {
		final LinkedAccount ret = new LinkedAccount();
		ret.update(authUser);
		return ret;
	}

	public void update(final AuthUser authUser) {
		this.providerKey = authUser.getProvider();
		this.providerUserId = authUser.getId();
	}

	public static LinkedAccount create(final LinkedAccount acc) {
		final LinkedAccount ret = new LinkedAccount();
		ret.providerKey = acc.providerKey;
		ret.providerUserId = acc.providerUserId;
		return ret;
	}
}