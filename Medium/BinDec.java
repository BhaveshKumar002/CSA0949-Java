import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        String binaryString = sc.nextLine();
        
        int decimal = binaryToDecimal(binaryString);
        String octal = Integer.toOctalString(decimal);
        
        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal: " + octal);
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            
            decimal += (binaryString.charAt(length - 1 - i) - '0') * Math.pow(2, i);
        }
        return decimal;
    }
}
