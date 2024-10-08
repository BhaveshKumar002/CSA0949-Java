import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Case (1 for String, 2 for Number): ");
        String input = sc.nextLine();
        System.out.print("Enter input: ");
        String value = sc.nextLine();

        String cleanedValue = value.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedValue).reverse().toString();

        System.out.println(cleanedValue.equals(reversed) ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }
}
