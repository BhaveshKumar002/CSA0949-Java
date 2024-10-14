import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = sc.nextInt();
        
        if (isPerfect(number)) {
            System.out.println("It's a Perfect Number.");
        } else {
            System.out.println("It's not a Perfect Number.");
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
