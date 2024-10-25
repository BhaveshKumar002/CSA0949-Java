class Date {
    int day, month, year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Student {
    int id;
    String name;
    Date dob;
    int[] marks;

    Student(int id, String name, Date dob, int[] marks) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }
}

public class DateandStudent {
    public static void main(String[] args) {
        Date dob = new Date(15, 8, 2000);
        int[] marks = {85, 90, 88};
        Student student = new Student(101, "John Doe", dob, marks);
        student.display();
    }
}

