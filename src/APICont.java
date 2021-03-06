import java.util.*;
import java.sql.*;

public class APICont {
	public static Connection conn = null;
	public static Statement stmt = null;

	public IUser createUser(Map<String, String> Data) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return IUser.signUp(Data);
	}

	public boolean sendFriendRequest(Map<String, String> Data) {

		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return false;
		return user.sendFriendRequest(Data);

	}

	public boolean addMember(IGroup group, IUser user, String role) {
		return group.addMember(user, role);
	}

	public Message getMessage(IUser user1) {
		IUser user = IUser.getCurrentActiveUser();

		return MessageModel.getMessage(user, user1);
	}

	public boolean promoteMember(IUser user, String new_role, IGroup group) {
		return group.promoteMember(user, new_role);
	}

	public List<IUser> getPendeningRequests() {
		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return null;
		return user.getPendingRequests();
	}

	public boolean addFriend(IUser user) {
		return IUser.addFriend(user);
	}

	public boolean changeGroupCoverPhoto(String newPhoto, IGroup group) {
		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return false;
		return group.changeGroupPicture(user, newPhoto);
	}

	public boolean createPage(Map<String, String> data) {
		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return false;
		IPage page = IPage.createPage(data, user);
		return PageModel.createPage(page, user);
	}

	public boolean likeAPage(IPage page) {
		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return false;

		return IPage.likeAPage(page, user);
	}

	public boolean login(Map<String, String> data) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		return IUser.login(data);
	}

	public boolean logout() {
		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return false;
		IUser.logout();
		return true;
	}

	APICont() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		// new com.mysql.jdbc.Driver();
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		// conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase?user=testuser&password=testpassword");
		String connectionUrl = "jdbc:mysql://localhost:3306/API";
		String connectionUser = "root";
		String connectionPassword = "root";
		conn = DriverManager.getConnection(connectionUrl, connectionUser,
				connectionPassword);
		stmt = conn.createStatement();

	}
}