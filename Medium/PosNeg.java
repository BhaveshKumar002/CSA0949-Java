import java.util.Scanner;
public class AvgPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posSum = 0, negSum = 0, posCount = 0, negCount = 0, num;
        while ((num = sc.nextInt()) != -1) {
            if (num > 0) { posSum += num; posCount++; }
            else if (num < 0) { negSum += num; negCount++; }
        }
        System.out.println("Average of positives: " + (posCount == 0 ? 0 : posSum / (double) posCount));
        System.out.println("Average of negatives: " + (negCount == 0 ? 0 : negSum / (double) negCount));
    }
}
