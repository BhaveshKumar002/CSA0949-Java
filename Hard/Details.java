import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueId;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueId) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + (telephoneNumber != null ? telephoneNumber : "N/A"));
        System.out.println("Mobile Number: " + (mobileNumber != null ? mobileNumber : "N/A"));
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID No: " + uniqueId);
        System.out.println();
    }
}

public class Directory {
    private ArrayList<Person> directory;

    public Directory() {
        directory = new ArrayList<>();
    }

    public void addPerson(Person person) {
        directory.add(person);
    }

    public void displayDirectory() {
        for (Person person : directory) {
            person.displayInfo();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Directory directory = new Directory();
        
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Entry " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Telephone Number (if available): ");
            String telephoneNumber = sc.nextLine();
            System.out.print("Mobile Number (if available): ");
            String mobileNumber = sc.nextLine();
            System.out.print("Head of Family: ");
            String headOfFamily = sc.nextLine();
            System.out.print("Unique ID No: ");
            String uniqueId = sc.nextLine();

            Person person = new Person(name, address, telephoneNumber.isEmpty() ? null : telephoneNumber,
                                        mobileNumber.isEmpty() ? null : mobileNumber, headOfFamily, uniqueId);
            directory.addPerson(person);
        }

        System.out.println("\nDirectory:");
        directory.displayDirectory();
    }
}
