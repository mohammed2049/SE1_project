import java.util.*;

public class UserModel {

    

  static public boolean CreateUser(IUser user) {
	  System.out.print(user.email + "\n" + user.gender+ "\n" + user.name+"\n" + user.password+"\n"+ user.type);
	  return true;
  }

  public void DeleteUser() {
  }

  static public ArrayList <IUser> getUser(String email) {
	  ArrayList <IUser> users = null;
	  return users;
  }

  public void updateUser() {
  }

  static public boolean addFriendRequest(String e1,String e2){
	  System.out.println( e1 +"  "+ e2  );
	  return true;
  }
}