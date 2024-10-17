import java.util.HashMap;
import java.util.Map;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(2, "Bob");
        Employee emp3 = new Employee(3, "Charlie");

        employeeMap.put(emp1.id, emp1);
        employeeMap.put(emp2.id, emp2);
        employeeMap.put(emp3.id, emp3);

        System.out.println("Employee records: " + employeeMap);

        employeeMap.remove(2);
        System.out.println("After removing Bob: " + employeeMap);

        System.out.println("Is the employee map empty? " + employeeMap.isEmpty());

        employeeMap.clear();
        System.out.println("After clearing the employee map. Is it empty? " + employeeMap.isEmpty());
    }
}
