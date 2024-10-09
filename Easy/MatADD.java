import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n], b = new int[n][n], c = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) b[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) c[i][j] = a[i][j] + b[i][j];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) System.out.print(c[i][j] + " ");
    }
}
