import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        try {
            for (int i = 0; i <= n; i++) { 
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Attempted to access index beyond the array size.");
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
