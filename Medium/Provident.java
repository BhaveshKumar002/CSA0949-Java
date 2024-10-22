import java.util.Scanner;

public class ProvidentFundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the employee's Provident Fund balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter the interest rate (in percentage): ");
            double interestRate = scanner.nextDouble();

            double interest = (balance * interestRate) / 100;

            System.out.println("Interest earned: " + interest);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
