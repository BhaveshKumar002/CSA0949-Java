package Hard;
import java.util.Scanner;

public class DaysAndWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        if (totalDays < 0) {
            System.out.println("Invalid input. Days cannot be negative.");
        } else {
            int years = totalDays / 365;
            totalDays %= 365;
            int weeks = totalDays / 7;
            totalDays %= 7;
            int days = totalDays;

            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + days);
        }

        System.out.print("\nEnter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;

        int f = day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int dayOfWeek = f % 7;

        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println("Day of the week: " + daysOfWeek[dayOfWeek]);

        scanner.close();
    }
}
