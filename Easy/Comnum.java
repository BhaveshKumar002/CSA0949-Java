import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        
        System.out.print("Composite numbers between " + A + " and " + B + ": ");
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isComposite(int num) {
        if (num < 4) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
