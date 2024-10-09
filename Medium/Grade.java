import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        String[] subjects = {"Python", "C Programming", "Mathematics", "Physics"};
        int total = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the marks in " + subjects[i] + ":");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double aggregate = total / 4.0;
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        if (aggregate > 75) System.out.println("DISTINCTION");
        else if (aggregate >= 60) System.out.println("FIRST DIVISION");
        else if (aggregate >= 50) System.out.println("SECOND DIVISION");
        else if (aggregate >= 40) System.out.println("THIRD DIVISION");
        else System.out.println("FAIL");
    }
}
