import java.util.Map;

public class UserModel {

    

  static public boolean CreateUser(IUser user) {
	  System.out.print(user.email + "\n" + user.gender+ "\n" + user.name+"\n" + user.password+"\n"+ user.type);
	  return true;
  }

  public void DeleteUser() {
  }

  public static boolean getUser(Map<String, String> data) {
	  IUser user = IUser.getCurrentActiveUser();
	  //user = data base return value
	  return true; 
  }

  public void updateUser() {
  }

  static public boolean addFriendRequest(String e1,String e2){
	  System.out.println( e1 +"  "+ e2  );
	  return true;
  }
}