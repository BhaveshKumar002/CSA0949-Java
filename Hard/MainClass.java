package marks;

public class Student {
    String name;
    int rollNumber;
    float marks;

    public Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

import marks.Student;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 89.5f);
        student1.display();
        
        Student student2 = new Student("Bob", 102, 92.0f);
        student2.display();
    }
}
