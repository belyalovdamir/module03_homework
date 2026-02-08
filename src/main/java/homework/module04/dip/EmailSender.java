package homework.module04.dip;

public class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
