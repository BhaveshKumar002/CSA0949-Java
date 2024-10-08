import java.util.Scanner;

public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBalance = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter the " + i + "st/nd/rd/th Denomination: ");
            int denom = sc.nextInt();
            System.out.print("Enter the number of notes for " + denom + " denomination: ");
            int notes = sc.nextInt();
            totalBalance += denom * notes; 
        }

        System.out.println("Total Available Balance in ATM: " + totalBalance);
        sc.close();
    }
}
