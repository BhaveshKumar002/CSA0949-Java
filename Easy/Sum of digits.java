import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " digit number: ");
        int number = sc.nextInt();

        int sum = 0;

        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Single digit sum of the digits is: " + sum);
    }
}
