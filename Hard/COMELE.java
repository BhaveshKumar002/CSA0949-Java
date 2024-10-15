import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> commonElements = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                
                if (arr1[i] == arr2[j] && !commonElements.contains(arr1[i])) {
                    commonElements.add(arr1[i]);
                }
            }
        }
        
        return commonElements;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4}; 
        int[] arr2 = {2, 4, 5, 6, 7}; 
        
        List<Integer> common = findCommonElements(arr1, arr2);
        
        System.out.println("Common elements: " + common); 
    }
}
