import java.util.*;

public class Group extends IGroup {

	public String title;

	public String coverPicture;

	public Map<IUser, String> users;

	public GroupModel myGroupModel;

	public void addMember(IUser user) {
	}

	public void removeMember() {
	}

	public void setRole() {
	}

	@Override
	public boolean changeGroupPicture(IUser user, String newPhoto) {
		if (!users.get(user).equals("admin"))
			return true;
		return GroupModel.updateGroupPhoto(this, newPhoto);
	}

}