import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        String reversedBinary = new StringBuilder(binary).reverse().toString();

        int reversedDecimal = Integer.parseInt(reversedBinary, 2);

        System.out.println("Reversed binary: " + reversedBinary);
        System.out.println("Decimal from reversed binary: " + reversedDecimal);
    }
}
