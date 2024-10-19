import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        System.out.println(findMissingNumber(a, 8));
    }

    public static int findMissingNumber(int[] a, int n) {
        boolean[] present = new boolean[n + 1];
        for (int num : a) {
            present[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return -1;
    }
}
