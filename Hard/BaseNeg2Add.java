public class BaseNeg2Addition {
    
    public static int[] addBaseNeg2(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int maxLength = Math.max(n1, n2);
        int[] result = new int[maxLength + 2];
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int bit1 = i < n1 ? arr1[n1 - 1 - i] : 0;
            int bit2 = i < n2 ? arr2[n2 - 1 - i] : 0;
            int sum = bit1 + bit2 + carry;

            if (sum % 2 == 1) {
                result[maxLength + 1 - i] = 1;
                carry = (sum - 1) / -2; 
            } else {
                result[maxLength + 1 - i] = 0;
                carry = sum / -2;
            }
        }
        
        if (carry != 0) {
            result[maxLength + 1 - maxLength] = 1; 
        }

        int startIndex = 0;
        while (startIndex < result.length && result[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex == result.length) return new int[]{0};

        int[] finalResult = new int[result.length - startIndex];
        System.arraycopy(result, startIndex, finalResult, 0, finalResult.length);
        return finalResult;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 1};
        int[] arr2 = {1, 0, 1};
        int[] result = addBaseNeg2(arr1, arr2);
        
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}
