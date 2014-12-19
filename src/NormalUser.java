import java.util.*;

public class NormalUser extends IUser {

	private int numberOfFriends;

	public boolean checkCurrentFriendsCount() {
		return numberOfFriends <= 400;
	}

	@Override
	public boolean sendFriendRequest(Map<String, String> Data) {
		// TODO Auto-generated method stub
		if (checkCurrentFriendsCount())
			return UserModel.addFriendRequest(this.email, Data.get("email"));
		return false;
	}

	@Override
	public void addFriend() {
		// TODO Auto-generated method stub

	}

	public boolean makeInstance(Map<String, String> Data) {
		// TODO Auto-generated method stub
		type=Data.get("type");
		gender = Data.get("gender");
		numberOfFriends = 0;
		subscribedGroups = new ArrayList<IGroup>();
		likedPages = new ArrayList<IPage>();
		name = Data.get("name");
		email = Data.get("email");
		password = Data.get("password");
		return UserModel.CreateUser(this);
	}

}