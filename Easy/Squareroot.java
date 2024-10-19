import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root: " + squareRoot + ", " + (-squareRoot));
    }
}
