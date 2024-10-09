import java.util.Arrays;
import java.util.HashMap;
public class MeanMedianMode {
    public static void main(String[] args) {
        double[] arr = {16, 18, 27, 16, 23, 21, 19};
        System.out.println("Mean = " + mean(arr));
        System.out.println("Median = " + median(arr));
        System.out.println("Mode = " + mode(arr));
    }

    static double mean(double[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    static double median(double[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return (n % 2 == 0) ? (arr[n / 2 - 1] + arr[n / 2]) / 2 : arr[n / 2];
    }

    static double mode(double[] arr) {
        HashMap<Double, Integer> freq = new HashMap<>();
        for (double num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
        return freq.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getKey();
    }
}
