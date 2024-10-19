import java.util.Scanner;

public class OddNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;
        int oddNumber = 1;

        System.out.println("The first " + n + " odd numbers are:");
        while (count < n) {
            System.out.print(oddNumber + " ");
            oddNumber += 2;
            count++;
        }

        int nthOddAfter = oddNumber + n - 2;
        System.out.println("\nNth odd number after " + n + " odd numbers: " + nthOddAfter);
    }
}
