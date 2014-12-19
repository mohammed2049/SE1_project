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
	public boolean login(Map<String, String> data) {
		return IUser.login(data);
	}
	public boolean logout() {
		IUser user = IUser.getCurrentActiveUser();
		if (user == null)
			return false;
		IUser.logout();
		return true;
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