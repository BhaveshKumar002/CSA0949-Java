import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a statement: ");
        String input = sc.nextLine();
        
        int vowelCount = 0;
        String vowels = "aeiou";

        for (char ch : input.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
    
        System.out.println("Number of vowels = " + vowelCount);
        
        sc.close();
    }
}
