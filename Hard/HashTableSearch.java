import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableSearch {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Alice", 90);
        ht.put("Bob", 85);
        ht.put("Charlie", 88);
        ht.put("David", 92);

        Enumeration<String> keys = ht.keys();
        System.out.println("All keys in the Hashtable:");

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + ht.get(key));
        }

        String searchKey = "Bob";
        if (ht.containsKey(searchKey)) {
            System.out.println("\nKey '" + searchKey + "' found with value: " + ht.get(searchKey));
        } else {
            System.out.println("\nKey '" + searchKey + "' not found.");
        }

        int searchValue = 88;
        if (ht.containsValue(searchValue)) {
            System.out.println("Value '" + searchValue + "' exists in the Hashtable.");
        } else {
            System.out.println("Value '" + searchValue + "' does not exist in the Hashtable.");
        }
    }
}
