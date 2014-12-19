public class MessageModel {

	public static boolean createMessage(IUser receiver, IUser user) {
		  return false;
	  }


  public void deleteMessage() {
  }

  public static Message getMessage(IUser user,IUser user2 ) {
	  Message m= new ChatMessage();// must return the message between these two users
	  return m;
  }

  public void updateMessage() {
  }

}