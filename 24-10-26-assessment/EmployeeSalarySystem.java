abstract class Employee {
    private final int employeeId;
    private final String name;
    private final double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.printf("Final salary: %.2f%n", calculateSalary());
    }

    protected double getBasicSalary() {
        return basicSalary;
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() * 1.20;
    }
}

class PartTimeEmployee extends Employee {
    private final int hoursWorked;
    private final double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double basicSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee(101, "Asha", 50000),
            new PartTimeEmployee(102, "Ravi", 0, 80, 250)
        };

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}
