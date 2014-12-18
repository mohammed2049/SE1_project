import java.util.*;

public abstract class IGroup {

	public GroupPrivacy privacy;

	//
	// public Vector 0..*;
	 public GroupPrivacy myGroupPrivacy;
	// public Vector hasA;

	public void addMember(IUser user) {
	}

	public void removeMember() {
	}

	public void setRole(String role) {
	}

	public void setPrivacy() {
	}

	public abstract boolean changeGroupPicture(IUser user, String newPhoto);

}