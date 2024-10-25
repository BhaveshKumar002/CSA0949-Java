import java.util.HashSet;
import java.util.Set;

public class BitwiseORSubarrays {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> current = new HashSet<>();
        
        for (int num : arr) {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(num);
            for (int x : current) {
                newSet.add(x | num);
            }
            result.addAll(newSet);
            current = newSet;
        }
        return result.size();
    }

    public static void main(String[] args) {
        BitwiseORSubarrays solution = new BitwiseORSubarrays();
        int[] arr = {1, 1, 2};
        System.out.println(solution.subarrayBitwiseORs(arr)); // Output: 3
    }
}
