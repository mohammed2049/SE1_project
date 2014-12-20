public class GroupModel {

    public Group myGroup;

  static public  boolean createGroup(IGroup newGroup) {
    return true;
  }

  public void updateGroup() {
  }

  public void getGroup() {
  }

  public void deleteGroup() {
  }

  public static boolean addMember(IGroup group, IUser user,String role){
	  return true;
  }

public static boolean updateUserInGroup(IUser user1, String new_role) {
	// TODO Auto-generated method stub
	return false;
}
 public static boolean updateGroupPhoto(IGroup group, String newPhoto) {
    return true;
  }
  
}