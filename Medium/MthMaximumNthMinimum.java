import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MthMaximumNthMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer[] array = {14, 16, 87, 36, 25, 89, 34};
        System.out.print("Array of elements: " + Arrays.toString(array) + "\n");
        
        System.out.print("Enter M (Mth maximum): ");
        int M = scanner.nextInt();
        
        System.out.print("Enter N (Nth minimum): ");
        int N = scanner.nextInt();

        Arrays.sort(array, Collections.reverseOrder());
        int mthMax = (M <= array.length && M > 0) ? array[M - 1] : Integer.MIN_VALUE;

        Arrays.sort(array);
        int nthMin = (N <= array.length && N > 0) ? array[N - 1] : Integer.MAX_VALUE;

        if (mthMax == Integer.MIN_VALUE || nthMin == Integer.MAX_VALUE) {
            System.out.println("Invalid M or N values.");
        } else {
            int sum = mthMax + nthMin;
            int difference = mthMax - nthMin;

            System.out.println(M + "th Maximum Number = " + mthMax);
            System.out.println(N + "th Minimum Number = " + nthMin);
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
        }
        
        scanner.close();
    }
}
