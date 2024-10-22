import java.util.Scanner;

class Singleton {
    private static Singleton instance;

    private Singleton() {
      
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Singleton obj1 = Singleton.getInstance();
            System.out.println("Object 1 created successfully.");

         
            Singleton obj2 = Singleton.getInstance();
            System.out.println("Object 2 created successfully."); 
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
