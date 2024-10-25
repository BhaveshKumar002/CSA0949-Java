import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;
    double pf;
    double allowance;

    public Employee(String name, int id, double salary, double pf, double allowance) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.pf = pf;
        this.allowance = allowance;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("PF: " + pf);
        System.out.println("Allowance: " + allowance);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Alice", 101, 50000, 5000, 2000);
        Employee emp2 = new Employee("Bob", 102, 60000, 6000, 2500);
        Employee emp3 = new Employee("Charlie", 103, 55000, 5500, 2200);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.display();
            System.out.println();
        }

        Employee empToRemove = emp2;
        employeeList.remove(empToRemove);

        System.out.println("After removing employee with ID 102:");
        for (Employee emp : employeeList) {
            emp.display();
            System.out.println();
        }
    }
}
