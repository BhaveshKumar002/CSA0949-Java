import java.util.Scanner;
public class PrimeNumbersAfterNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), count = 0, num = 2, nthPrime = 0;
        
        while (count < N) {
            if (isPrime(num)) {
                nthPrime = num;
                count++;
            }
            num++;
        }
        
        System.out.println(N + "rd Prime number is " + nthPrime);
        System.out.print(N + " prime numbers after " + nthPrime + " are: ");
        
        count = 0;
        while (count < N) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }
}
