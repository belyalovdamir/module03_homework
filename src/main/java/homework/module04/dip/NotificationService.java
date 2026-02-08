package homework.module04.dip;

import java.util.List;

public class NotificationService {
    private List<MessageSender> list;

    public NotificationService(List<MessageSender> list) {
        this.list = list;
    }
    public void notifyAllUsers(String message) {
        for (MessageSender sender : list) {
            sender.send(message);
        }
    }
}
