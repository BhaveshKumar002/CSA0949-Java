import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        int number = 143;
        Set<String> permutations = new HashSet<>();
        generatePermutations(String.valueOf(number), "", permutations);
        System.out.println("Permutations are: " + permutations);
    }

    private static void generatePermutations(String str, String prefix, Set<String> result) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i), result);
            }
        }
    }
}
