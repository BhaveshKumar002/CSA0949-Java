import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit; 
            number /= 10; 
        }

        System.out.println("Reverse Number: " + reversed);
    }
}
