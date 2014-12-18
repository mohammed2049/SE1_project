import java.util.*;

public abstract class IPage {

	static List<IUser> liked;
	
	public static boolean likeAPage(IPage page, IUser user) {
		liked.add(user);
		return PageModel.createLike(page, user);
	}

	public static IPage createPage(Map<String, String> data, IUser user) {
		return new Page();
	}

}