import java.util.*;

public abstract class GroupPrivacy {


	public IGroup myIGroup;

	public abstract IUser getAllowedMembers(IGroup group);
	
	public abstract boolean addAllowedMembers(IUser user);
}