package homework.module04.dip;

public class SmsSender implements MessageSender {
    public void send(String message) {
        System.out.println("Отправка sms: " + message);
    }
}
