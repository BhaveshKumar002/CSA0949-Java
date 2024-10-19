class Student {
    String name;
    String registerNumber;
    int[] marks;

    public Student(String name, String registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }

    public void display() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / (double) marks.length;
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        Student student = new Student("John Doe", "12345", marks);
        student.display();
    }
}
