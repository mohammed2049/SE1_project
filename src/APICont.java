import java.util.*;

public class APICont {
	
	public IUser createUser(Map <String,String > Data){
		return IUser.signUp(Data);
	}
	
	public boolean sendFriendRequest(Map<String,String> Data){
		
		IUser user= IUser.getCurrentActiveUser();
		if(user==null)
			return false;
		return user.sendFriendRequest( Data );
		
	}
	
	public boolean createGroup(Map<String, String> data){
		IUser user= IUser.getCurrentActiveUser();
		if(user==null)
			return false;
		IGroup newGroup = new Group();
		
		newGroup = newGroup.makeGroup(data, user);
		
		return GroupModel.createGroup(newGroup);
	}
	
	public ArrayList<IUser> searchForUser(String email){
		ArrayList<IUser> A = null;
		IUser user= IUser.getCurrentActiveUser();
		if(user==null)
			return A;
		return UserModel.getUser(email);
		
	}
	public boolean sendAMessage (IUser user){
		Message newMessage = new ChatMessage();
		newMessage.addReceiver(user);
	
		return newMessage.sendMessage();
	}
	
	public APICont(){
		
	}
}