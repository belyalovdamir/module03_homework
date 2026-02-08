package homework.module04.srp;

public class Order {
    private int quantity;
    private double price;
    public Order(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
}
