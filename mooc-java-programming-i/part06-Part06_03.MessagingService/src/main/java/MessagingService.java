
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fil
 */
public class MessagingService {

    private final ArrayList<Message> messageBox;

    public MessagingService() {
        this.messageBox = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            Message msg = new Message(message.getSender(), subString(message.getContent(), 0, 280));
            this.messageBox.add(msg);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messageBox;
    }

    private String subString(String str, int starts, int ends) {
        if (starts < 0) {
            starts = 0;
        }
        if (ends > str.length()) {
            ends = str.length();
        }
        if (ends <= starts) {
            return "";
        }
        return (String) str.subSequence(starts, ends);
    }

}
