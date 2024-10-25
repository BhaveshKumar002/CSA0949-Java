import java.util.Vector;

class StudentInfo {
    String name, rollNumber, department, course, contactInfo;

    StudentInfo(String name, String rollNumber, String department, String course, String contactInfo) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.course = course;
        this.contactInfo = contactInfo;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Department: " + department + 
               ", Course: " + course + ", Contact: " + contactInfo;
    }
}

public class StudentInformation {
    public static void main(String[] args) {
        Vector<StudentInfo> students = new Vector<>();

        students.add(new StudentInfo("Alice", "R001", "CS", "B.Tech", "1234567890"));
        students.add(new StudentInfo("Bob", "R002", "IT", "B.Tech", "0987654321"));

        System.out.println("All Students:");
        for (StudentInfo student : students) {
            System.out.println(student);
        }

        System.out.println("\nRetrieving Bob's Record:");
        for (StudentInfo student : students) {
            if (student.rollNumber.equals("R002")) {
                System.out.println(student);
            }
        }

        students.removeIf(s -> s.rollNumber.equals("R002"));
        System.out.println("\nAfter Removing Bob:");
        for (StudentInfo student : students) {
            System.out.println(student);
        }
    }
}

