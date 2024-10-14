import java.util.Scanner;

public class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (true) {
            int reversed = reverseNumber(number);
            System.out.println(number + " + " + reversed + " = " + (number + reversed));
            number += reversed;
            if (isPalindrome(number)) {
                System.out.println("Palindrome: " + number);
                break;
            }
        }
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    private static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
}
