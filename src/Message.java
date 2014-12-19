import java.util.*;

public abstract class Message {

    public ArrayList <IUser>  myIUser;

 

  public abstract boolean sendMessage();

  public abstract void addReceiver(IUser user);

}