import java.util.Scanner;

public class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int sum = calculateEvenSumFibonacci(n);
        System.out.println("Sum of even indexed Fibonacci numbers: " + sum);
    }

    public static int calculateEvenSumFibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += a;
            }
            int c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }
}
