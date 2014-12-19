public class ChatMessage extends Message {

  public IUser receiver;

  public void addReceiver(IUser user) {
	  receiver = user;
  }
  public boolean sendMessage() {
	  IUser user= IUser.getCurrentActiveUser();
	  if(user==null)
			return false;
	  
	  return MessageModel.createMessage(receiver, user);
  }

}