package homework.module04;
import homework.module04.dip.*;
import homework.module04.isp.*;
import homework.module04.ocp.*;
import homework.module04.srp.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Order order = new Order(2, 10000);
        PriceCalculator pc = new PriceCalculator();
        PaymentProcessor pay = new PaymentProcessor();
        Notifier note = new Notifier();
        double total = pc.calculate(order);
        System.out.println("Итоговая сумма: " + total);
        pay.process();
        note.send();
        Employee emp = new Employee(200000, "Постоянный");
        SalaryCalculator sc = new SalaryCalculator();
        System.out.println("Зарплата: " + sc.calculate(emp));
        Printer printer = new Printer();
        printer.print();
        List<MessageSender> senders = Arrays.asList(new EmailSender(), new SmsSender());
        NotificationService ns = new NotificationService(senders);
        ns.notifyAllUsers("Тестовое сообщение");
    }
}
