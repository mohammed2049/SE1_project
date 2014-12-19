public class ClosedPrivacy extends GroupPrivacy {

  
  public void isAllowed(IUser user) {
  }

@Override
public void getAllowedMembers(IGroup group) {
	// TODO Auto-generated method stub
	
}

	@Override
	public void setAllowedMembers(IUser user) {
		allowedUsers.add(user);
		
	}

}