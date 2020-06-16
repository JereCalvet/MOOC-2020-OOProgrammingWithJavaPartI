
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> dbMessages;

    public MessagingService() {
        this.dbMessages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() < 281) {
            this.dbMessages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return dbMessages;
    }    
}
