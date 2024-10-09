import java.util.Scanner;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = 0, lower = 0, digits = 0;
        char ch;
        while ((ch = sc.next().charAt(0)) != '*') {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digits++;
        }
        System.out.println("Lower case: " + lower + "\nUpper case: " + upper + "\nNumbers: " + digits);
    }
}
