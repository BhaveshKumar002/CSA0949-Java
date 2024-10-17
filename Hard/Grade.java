import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[6];

    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"Python", "C Programming", "Mathematics", "Physics", "Chemistry", "Professional Ethics"};
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
    }
}

class Result extends Student {
    int total = 0;
    double aggregate;

    public void calculateTotalAndAggregate() {
        for (int mark : marks) {
            total += mark;
        }
        aggregate = total / 6.0;
    }

    public void displayResult() {
        System.out.println("Total= " + total);
        System.out.printf("Aggregate = %.2f\n", aggregate);
        if (aggregate > 75) {
            System.out.println("Class: DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("Class: FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("Class: SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("Class: THIRD DIVISION");
        } else {
            System.out.println("Class: FAIL");
        }
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Result student = new Result();
        student.inputMarks();
        student.calculateTotalAndAggregate();
        student.displayResult();
    }
}
