public class PublicPrivacy extends GroupPrivacy {

  public Integer importance;

  public void setImportance() {
  }

  public void getImportance() {
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