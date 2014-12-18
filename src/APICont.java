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
	public APICont(){
		
	}
}
