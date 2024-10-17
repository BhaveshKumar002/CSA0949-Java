import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int prevMonthReading;
    int currMonthReading;
    int totalUnits;
    double billAmount;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Consumer No.: ");
        consumerNo = sc.nextInt();
        System.out.print("Enter Consumer Name: ");
        consumerName = sc.next();
        System.out.print("Enter Previous Month Reading: ");
        prevMonthReading = sc.nextInt();
        System.out.print("Enter Current Month Reading: ");
        currMonthReading = sc.nextInt();
        totalUnits = currMonthReading - prevMonthReading;
    }

    public void calculateBill() {
        if (totalUnits <= 100) {
            billAmount = totalUnits * 1;
        } else if (totalUnits <= 200) {
            billAmount = 100 * 1 + (totalUnits - 100) * 2.5;
        } else if (totalUnits <= 500) {
            billAmount = 100 * 1 + 100 * 2.5 + (totalUnits - 200) * 4;
        } else {
            billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (totalUnits - 500) * 6;
        }
    }

    public void displayBill() {
        System.out.println("\nElectricity Bill:");
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.inputDetails();
        bill.calculateBill();
        bill.displayBill();
    }
}
