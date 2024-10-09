import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n], b = new int[n][n], c = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) b[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++)
            for (int k = 0; k < n; k++) c[i][j] += a[i][k] * b[k][j];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) System.out.print(c[i][j] + " ");
    }
}
