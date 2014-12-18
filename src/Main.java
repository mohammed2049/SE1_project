import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APICont obj= new APICont();
		Map<String, String >Data= new HashMap<String,String>();
		Data.put("email", "1");
		Data.put("password", "2");
		Data.put("name", "3");
		Data.put("type", "normal");
		obj.createUser(Data);
		
		Map<String, String >Data1= new HashMap<String,String>();
		Data1.put("email", "2");
		
		
		System.out.println("\n\n\n");
		obj.sendFriendRequest(Data1);
	}

}
