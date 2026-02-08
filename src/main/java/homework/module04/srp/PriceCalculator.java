package homework.module04.srp;
public class PriceCalculator {
    public double calculate(Order order) {
        return order.getQuantity() * order.getPrice();
    }
}
