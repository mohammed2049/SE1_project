import java.util.*;

public abstract class IGroup {

	public GroupPrivacy myGroupPrivacy;

	public void addMember(IUser user) {
	}

	public void removeMember() {
	}

	public void setRole(String role) {

	}

	public void setPrivacy() {
	}

	public abstract IGroup makeGroup(Map<String, String> data, IUser user);

}