public class PowerCalculation {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(pow(x, n));
    }

    public static double pow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / pow(x, -n);
        double half = pow(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
}
