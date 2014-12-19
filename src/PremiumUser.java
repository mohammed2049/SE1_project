import java.util.*;

public class PremiumUser extends IUser {

	private String creditCardNumber;

	public boolean payByCredit() {
		return false;
	}

	@Override
	public boolean sendFriendRequest( Map<String,String> Data) {
		// TODO Auto-generated method stub
		return UserModel.addFriendRequest(this.email,Data.get("email"));
	}



	public boolean makeInstance(Map<String, String> Data) {
		// TODO Auto-generated method stub
		creditCardNumber = Data.get("creditCard");

		if (payByCredit()) {
			type=Data.get("type");
			gender= Data.get("gender");
			subscribedGroups = new ArrayList<IGroup>();
			likedPages = new ArrayList<IPage>();
			name = Data.get("name");
			email = Data.get("email");
			password = Data.get("password");
			return UserModel.CreateUser(this);
		}

		return false;
	}

	

}