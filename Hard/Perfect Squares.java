import java.util.Scanner;
import java.util.ArrayList;
public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt(), upper = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = (int) Math.ceil(Math.sqrt(lower)); i <= Math.sqrt(upper); i++) {
            int square = i * i;
            if (digitSum(square) < 10) result.add(square);
        }
        System.out.println(result);
    }

    static int digitSum(int num) {
        int sum = 0;
        while (num != 0) { sum += num % 10; num /= 10; }
        return sum;
    }
}
