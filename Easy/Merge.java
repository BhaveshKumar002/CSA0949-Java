import java.util.ArrayList;
import java.util.Collections;
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5}, arr2 = {2, 4, 6, 8};
        ArrayList<Integer> merged = new ArrayList<>();
        for (int i : arr1) merged.add(i);
        for (int i : arr2) merged.add(i);
        Collections.sort(merged);
        System.out.println(merged);
    }
}
