import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = sc.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        double salary = sc.nextDouble();

        double bonus = (grade == 'A') ? 0.05 * salary : 0.10 * salary;

        if (salary < 10000) {
            bonus += 0.02 * salary;
        }

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid: " + (salary + bonus));

        sc.close();
    }
}
