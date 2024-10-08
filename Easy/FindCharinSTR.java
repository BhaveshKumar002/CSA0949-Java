import java.util.Scanner;

public class FindCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                System.out.println(searchChar + " is found in string at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchChar + " is not found in the string.");
        }

        sc.close();
    }
}
