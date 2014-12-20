import java.sql.*;
import java.util.*;

public class UserModel {

    

  static public boolean CreateUser(IUser user) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
	  Class.forName("com.mysql.jdbc.Driver").newInstance();
	  PreparedStatement pStatement = null;
	  pStatement = APICont.conn.prepareStatement("INSERT INTO `Users` VALUES(default,?,?,?,?,?,?,?)");
	  pStatement.setString(1, user.first_name);
	  pStatement.setString(2, user.last_name);
	  pStatement.setString(3 , user.email);
	  pStatement.setString(4, user.password);
	  pStatement.setString(5, user.credit_card);
	  pStatement.setString(6, user.type);
	  pStatement.setString(7, user.gender);
	  pStatement.executeUpdate();
      return true;
  }

  public void DeleteUser() {
  }

 public static boolean getUser(Map<String, String> data) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	IUser user = IUser.getCurrentActiveUser();
    ResultSet res = null;
    if(user != null)
    	return false;
    String q = "SELECT * FROM Users where email = '" + data.get("email") + "' and password = '" + data.get("password") + "'";
    res = APICont.stmt.executeQuery(q);
    while(res.next()){
    	if(res.getString("type").equals("premium")){
    		user = new PremiumUser();
    		user.credit_card = res.getString("credit_card");
    	}else
    		user = new NormalUser();
    	user.first_name = res.getString("first_name"); 	
    	user.last_name = res.getString("last_name");
    	user.email = res.getString("email");
    	user.password = res.getString("password");
    	user.gender = res.getString("gender");
    	user.type = res.getString("type");
    	System.out.println(user.last_name + " " + user.type);
    	return true;
    }
    System.out.println("invalid email or password");
    return false; 
  }

  public void updateUser() {
  }

  static public boolean addFriendRequest(String e1,String e2){
	  System.out.println( e1 +"  "+ e2  );
	  return true;
  }
  
  public  static  List<IUser> getFriendsList(String status){
	  List<IUser> users= new ArrayList<IUser>();
	  return users;
  }
  public static boolean addNewFriendship(IUser user, IUser user1){
	  return false;
  }
}