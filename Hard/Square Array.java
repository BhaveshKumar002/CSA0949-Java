import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int upper = scanner.nextInt();
        
        List<int[]> result = new ArrayList<>();
        if (lower <= upper) {
            for (int i = lower; i <= upper; i++) {
                result.add(new int[]{i, i * i});
            }
        }
        System.out.println(result);
    }
}
