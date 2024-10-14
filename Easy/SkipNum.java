import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter K: ");
        int K = sc.nextInt();
        
        printNumbers(M, N, K);
    }

    public static void printNumbers(int M, int N, int K) {
        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
