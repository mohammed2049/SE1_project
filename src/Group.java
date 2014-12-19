import java.util.Map;

public class Group extends IGroup {

	public String title;

	public String coverPicture;

	public Map<IUser , String> users;

	public GroupModel myGroupModel;

	public Group() {
	}

	public void addMember(IUser user) {
	}

	public void removeMember() {
	}

	public void setRole() {
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