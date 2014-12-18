import java.util.*;

public class Group extends IGroup {

	public String title;

	public String coverPicture;

	public Map<IUser, String> users;

	public GroupModel myGroupModel;

	public boolean addMember(IUser user) {
		return true;
	}

	public void removeMember() {
	}

	public void setRole() {
	}

	public  boolean canPromote(IUser user1) {
		if( users.containsKey(user1) )
			return true;
		return false;
	}
	
	

}