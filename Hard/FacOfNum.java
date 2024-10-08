import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given Number: ");
        int number = sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

       
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Number of factors = " + factors.size());

        if (N <= factors.size()) {
            System.out.println(N + "th factor of " + number + " = " + factors.get(N - 1));
        } else {
            System.out.println("Invalid N! There are only " + factors.size() + " factors.");
        }

        sc.close();
    }
}
