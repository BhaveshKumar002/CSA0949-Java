public class ThreePartsEqualBinary {
    
    public static int[] threeEqualParts(int[] arr) {
        int totalOnes = 0;
        
        for (int num : arr) {
            if (num == 1) totalOnes++;
        }
        
        if (totalOnes == 0) return new int[]{0, arr.length - 1};
        
        if (totalOnes % 3 != 0) return new int[]{-1, -1};
        
        int onesPerPart = totalOnes / 3;
        int firstPartEnd = -1, secondPartEnd = -1, thirdPartEnd = -1;
        int onesCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) onesCount++;
            if (onesCount == 1) firstPartEnd = i; 
            if (onesCount == onesPerPart + 1) secondPartEnd = i; 
            if (onesCount == 2 * onesPerPart + 1) thirdPartEnd = i; 
        }
        
        while (thirdPartEnd < arr.length && arr[firstPartEnd] == arr[secondPartEnd] && arr[secondPartEnd] == arr[thirdPartEnd]) {
            firstPartEnd++;
            secondPartEnd++;
            thirdPartEnd++;
        }
        
        if (thirdPartEnd == arr.length) {
            return new int[]{firstPartEnd - 1, secondPartEnd};
        }
        
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int[] result = threeEqualParts(arr);
        
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}
