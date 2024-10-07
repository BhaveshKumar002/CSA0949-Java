import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Re-enter the username for confirmation: ");
        String confirmUsername = scanner.nextLine();

        if (isValidUsername(username) && username.equals(confirmUsername)) {
            System.out.println("Username is valid and confirmed.");
        } else {
            System.out.println("Invalid username or mismatch in confirmation.");
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
                return false;
            }
        }
        return true;
    }
}
