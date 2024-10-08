import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a line: ");
        String input = sc.nextLine();
        
        int specialCharCount = 0;
        System.out.print("Special characters: ");
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
                specialCharCount++;
            }
        }
    
        System.out.println("\nNumber of special characters: " + specialCharCount);
        
        sc.close();
    }
}
