import java.util.*;

public abstract class GroupPrivacy {

	public List<IUser> allowedUsers;

	public IGroup myIGroup;

	public abstract void getAllowedMembers(IGroup group);

	public abstract void setAllowedMembers(IUser user);

}