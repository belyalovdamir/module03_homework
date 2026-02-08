package homework.module04.ocp;

public class SalaryCalculator {
    public double calculate(Employee emp) {
        if (emp.getType().equals("Постоянный")) return emp.getBaseSalary() * 1.2;
        if (emp.getType().equals("Контракт")) return emp.getBaseSalary() * 1.1;
        return emp.getBaseSalary();
    }
}
