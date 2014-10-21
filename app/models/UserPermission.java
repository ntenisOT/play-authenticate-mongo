package models;

import be.objectify.deadbolt.core.models.Permission;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * Initial version based on work by Steve Chaloner (steve@objectify.be) for
 * Deadbolt2
 */
@Entity
public class UserPermission implements Permission {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;

	public String value;

	public String getValue() {
		return value;
	}

	public static UserPermission findByValue(User u, String value) {
		List<UserPermission> perms = u.getUserPermissions();

		for(UserPermission p : perms) {
			if (p.value.equalsIgnoreCase(value))
				return p;
		}
		return null;
	}
}
