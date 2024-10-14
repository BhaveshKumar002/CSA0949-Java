import java.util.Scanner;

public class NumberOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given number: ");
        int number = sc.nextInt();
        
        int factors = countFactors(number);
        System.out.println("Number of factors = " + factors);
    }

    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
