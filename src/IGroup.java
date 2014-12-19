import java.util.*;

public abstract class IGroup {

	public GroupPrivacy myGroupPrivacy;
	
	//
	// public Vector 0..*;
	// public GroupPrivacy myGroupPrivacy;
	// public Vector hasA;

	public boolean addMember(IUser user, String role) {
		if (myGroupPrivacy instanceof ClosedPrivacy) {
			myGroupPrivacy.addAllowedMembers(user);
		}
		return GroupModel.addMember(this, user, role);

	}

	public void removeMember() {
	}

	public void setRole(String role) {
	}

	public void setPrivacy() {
	}

	public abstract  boolean canPromote(IUser user1);

	public boolean promoteMember(IUser user, String new_role) {
		IUser user1 = IUser.getCurrentActiveUser();
		if (canPromote(user1) && user1!= null) {
			return  GroupModel.updateUserInGroup(user1,new_role);
		}
		return false;
	}

	
	public abstract boolean changeGroupPicture(IUser user, String newPhoto);
	public abstract IGroup makeGroup(Map<String, String> data, IUser user);
	
}