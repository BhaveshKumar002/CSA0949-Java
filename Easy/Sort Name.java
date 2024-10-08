import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the number of names from the user
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Get the list of names from the user
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        
        // Get order input (A for Ascending, D for Descending)
        System.out.print("Order(A/D): ");
        char order = sc.next().charAt(0);
        
        // Sort names based on user's choice
        if (order == 'A' || order == 'a') {
            Arrays.sort(names);
        } else if (order == 'D' || order == 'd') {
            Arrays.sort(names, (a, b) -> b.compareTo(a)); // Sort in descending order
        } else {
            System.out.println("Invalid choice! Enter A or D.");
            return;
        }
        
        // Print the sorted array
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        
        sc.close();
    }
}
