import java.sql.SQLException;
import java.util.*;

public class PremiumUser extends IUser {

	private String creditCardNumber;

	public boolean payByCredit() {
		
		return (creditCardNumber.length() == 14);
	}

	@Override
	public boolean sendFriendRequest( Map<String,String> Data) {
		// TODO Auto-generated method stub
		return UserModel.addFriendRequest(this.email,Data.get("email"));
	}



	public boolean makeInstance(Map<String, String> Data) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		creditCardNumber = Data.get("credit_card");

		if (payByCredit()) {
			type=Data.get("type");
			gender= Data.get("gender");
			subscribedGroups = new ArrayList<IGroup>();
			likedPages = new ArrayList<IPage>();
			first_name = Data.get("first_name");
			last_name = Data.get("last_name");
			email = Data.get("email");
			password = Data.get("password");
			credit_card = creditCardNumber;
			return UserModel.CreateUser(this);
		}

		return false;
	}

}