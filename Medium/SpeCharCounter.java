import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given statement: ");
        String statement = sc.nextLine();
        
        int specialCharacterCount = countSpecialCharacters(statement);
        
        System.out.println("Number of special Characters: " + specialCharacterCount);
    }

    public static int countSpecialCharacters(String statement) {
        int count = 0;
        for (char c : statement.toCharArray()) {
            
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }
}
