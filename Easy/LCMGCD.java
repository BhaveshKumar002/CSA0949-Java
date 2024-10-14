import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values (N): ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int gcd = findGCD(numbers);
        int lcm = findLCM(numbers, gcd);

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    public static int findGCD(int[] numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = gcdHelper(gcd, numbers[i]);
        }
        return gcd;
    }

    public static int gcdHelper(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdHelper(b, a % b);
    }

    public static int findLCM(int[] numbers, int gcd) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / gcdHelper(lcm, numbers[i]);
        }
        return lcm;
    }
}
