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
	
	public boolean changeGroupPicture(IUser user, String newPhoto) {
		if (!users.get(user).equals("admin"))
			return true;
		return GroupModel.updateGroupPhoto(this, newPhoto);
	}
	public IGroup makeGroup(Map<String, String> data, IUser user) {
		
		if (data.get("group_privacy").equals("close_privacy")) {
			myGroupPrivacy = new ClosedPrivacy();
		} else if (data.get("group_privacy").equals("public_privacy")) {
			myGroupPrivacy = new PublicPrivacy();
		}
		myGroupPrivacy.setAllowedMembers(user); 
		this.coverPicture = data.get("coverPicture");
		this.title = data.get("title");
		users.put(user, "Admin");
		return this;
	}

}