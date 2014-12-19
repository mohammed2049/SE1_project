import java.util.*;

public abstract class IUser {

	protected List<IGroup> subscribedGroups;

	protected List<IPage> likedPages;

	protected String type;
	
	protected String name;

	protected String email;

	protected Message message;

	protected List<IUser> friends;

	protected static IUser user;

	protected String password;
	
	protected String gender;
	
	public abstract boolean sendFriendRequest(Map<String,String> Data );

	public static boolean addFriend(IUser user1){
		return UserModel.addNewFriendship(user1, user);
	}

	public static IUser signUp(Map<String, String> Data) {
		if (Data.get("type").equals("primuim"))
			user = new PremiumUser();
		else
			user = new NormalUser();

		if (user.makeInstance(Data))
			return user;
		

		return null;
	}

	public List<IUser> getPendingRequests(){
		return UserModel.getFriendsList("Pending");
	}
	public boolean AddFriend(IUser user){
		return UserModel.addNewFriendship(this,user);
	}
	public static IUser getCurrentActiveUser() {
		if (user == null)
			return null;
		return user;
	}

	

	public static boolean login(Map<String, String> data) {
		if (user != null) {
			return ! (UserModel.getUser(data.get("email")).isEmpty());
		}
		return false;
	}

	public static void logout() {
		user = null;
	}

	private void User() {
	}
	
	protected abstract boolean makeInstance(Map<String, String> Data);
}