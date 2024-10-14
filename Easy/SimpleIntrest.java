import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        System.out.print("Is customer a senior citizen (y/n): ");
        char isSenior = sc.next().charAt(0);
        
        double rateOfInterest = (isSenior == 'y' || isSenior == 'Y') ? 12.0 : 10.0;
        double interest = calculateSimpleInterest(principal, rateOfInterest, years);
        
        System.out.println("Interest: " + interest);
    }

    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}
