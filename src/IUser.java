import java.sql.SQLException;
import java.util.*;

public abstract class IUser {

	public List<IGroup> subscribedGroups;

	public List<IPage> likedPages;

	public String type;
	
	public String first_name;
	
	public String last_name;

	public String credit_card;
	
	public String email;

	public Message message;

	public List<IUser> friends;

	public static IUser user;

	public String password;
	
	public String gender;
	
	public abstract boolean sendFriendRequest(Map<String,String> Data );

	public static boolean addFriend(IUser user1){
		return UserModel.addNewFriendship(user1, user);
	}

	public static IUser signUp(Map<String, String> Data) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		if (Data.get("type").equals("premuim"))
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

	

	public static boolean login(Map<String, String> data) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		if (user == null) {
			return UserModel.getUser(data);
		}
		return false;
	}

	@SuppressWarnings({ "unused", "unused" })
	public static void logout() {
		user = null;
	}

	
	protected abstract boolean makeInstance(Map<String, String> Data) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException;
}