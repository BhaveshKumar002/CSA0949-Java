class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double travelAllowance, houseRentAllowance;

    Manager(String name, double baseSalary, double travelAllowance, double houseRentAllowance) {
        super(name, baseSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    @Override
    double getSalary() {
        return baseSalary + travelAllowance + houseRentAllowance;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 70000, 5000, 8000);

        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Manager Salary: " + mgr.getSalary());
    }
}

