import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = sc.nextLine();
        int year = Integer.parseInt(date.split("/")[2]);
        
        if (isLeapYear(year)) {
            System.out.println("Given year is a Leap Year.");
        } else {
            System.out.println("Given year is Non Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
