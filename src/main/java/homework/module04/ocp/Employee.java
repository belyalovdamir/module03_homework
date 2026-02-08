package homework.module04.ocp;
public class Employee {
    private double baseSalary;
    private String type;

    public Employee(double baseSalary, String type) {
        this.baseSalary = baseSalary;
        this.type = type;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public String getType() {
        return type;
    }
}
