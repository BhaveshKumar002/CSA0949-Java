import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int N = scanner.nextInt();

        int[][] matrix = new int[N][N];

        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Row-wise display:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Column-wise display:");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
