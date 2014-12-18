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
	public APICont(){
		
	}
	
	public boolean addMember(IGroup group , IUser user, String role){
		return group.addMember(user,role);
	}
	public Message getMessage(IUser user1){
		IUser user= IUser.getCurrentActiveUser();
		
		return MessageModel.getMessage(user, user1);
	}
	
	public boolean promoteMember(IUser user, String new_role, IGroup group){
		return group.promoteMember(user,new_role);
	}
	
	public List<IUser> getPendeningRequests(){
		IUser user= IUser.getCurrentActiveUser();
		if(user== null)
			return null;
		return user.getPendingRequests();
	}
	public boolean addFriend(IUser user){
		return IUser.addFriend(user);
	}
}