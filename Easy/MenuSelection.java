import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Selection Statement");
            System.out.println("2. Iteration Statement");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Selection Statement Syntax");
                    break;
                case 2:
                    System.out.println("Iteration Statement Syntax");
                    break;
            }
        } while (choice != 3);
    }
}
