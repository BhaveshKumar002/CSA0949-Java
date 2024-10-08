import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Decimal Number: ");
        int decimal = sc.nextInt();

        System.out.println("Binary Number = " + Integer.toBinaryString(decimal));
        System.out.println("Octal = " + Integer.toOctalString(decimal));

        sc.close();
    }
}
