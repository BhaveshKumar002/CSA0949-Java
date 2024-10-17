import java.util.HashMap;

public class BankDetails {
    public static void main(String[] args) {
        HashMap<Integer, String> bankDetails = new HashMap<>();

        bankDetails.put(1001, "Alice Johnson");
        bankDetails.put(1002, "Bob Smith");
        bankDetails.put(1003, "Charlie Brown");

        System.out.println("Size of HashTable: " + bankDetails.size());

        bankDetails.clear();
        System.out.println("HashTable cleared. Size of HashTable: " + bankDetails.size());
    }
}
