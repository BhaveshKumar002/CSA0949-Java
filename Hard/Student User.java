import java.util.Scanner;

public class UserCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Users: ");
        int totalUsers = sc.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = sc.nextInt();

        int nonTeachingStaff = staffUsers / 3;

        int studentUsers = totalUsers - staffUsers - nonTeachingStaff;

        System.out.println("Student Users: " + studentUsers);

        sc.close();
    }
}
