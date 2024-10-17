import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String replacedString = input.replace("Saveetha", "XYZ");
        int length = input.length();
        String upperCaseString = input.toUpperCase();
        System.out.println("Replaced String: " + replacedString);
        System.out.println("Length of String: " + length);
        System.out.println("Uppercase Conversion: " + upperCaseString);
        scanner.close();
    }
}
