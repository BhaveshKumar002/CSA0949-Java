import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = sc.nextLine().toLowerCase();

        char[] letters = word.toCharArray();

        Arrays.sort(letters);

        System.out.print("Alphabetical Order (Reverse): ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }

        sc.close();
    }
}
