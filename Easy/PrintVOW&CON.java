import java.util.Scanner;

public class SeparateConsonantsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given Word: ");
        String word = sc.nextLine().toLowerCase();

        String vowels = "", consonants = "";
        String vowelSet = "aeiou";

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelSet.indexOf(ch) != -1) {
                    vowels += ch + " ";
                } else {
                    consonants += ch + " ";
                }
            }
        }

        System.out.println("Consonants: " + consonants.trim());
        System.out.println("Vowels: " + vowels.trim());

        sc.close();
    }
}
