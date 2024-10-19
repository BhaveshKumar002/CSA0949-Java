import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int m = sc.nextInt();
        System.out.print("N = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }
    }
}
