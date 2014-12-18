import java.util.List;

public class ClosedPrivacy extends GroupPrivacy {

  public List<IUser> allowedUsers;

  public void isAllowed(IUser user) {
  }

  public boolean addAllowedMembers(IUser user){
	  allowedUsers.add(user);
	  return true;
  }
}