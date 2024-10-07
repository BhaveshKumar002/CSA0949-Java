import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");
        int primeCount = 0;
        int compositeCount = 0;
        for (String numberStr : numbers) {
            try {
                int number = Integer.parseInt(numberStr);
                if (number < 2) {
                    continue;
                }
                if (isPrime(number)) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
        scanner.close();
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
