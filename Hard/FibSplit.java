import java.util.ArrayList;
import java.util.List;

public class FibonacciSplit {

    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        int n = num.length();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int first = getInteger(num.substring(0, i));
                int second = getInteger(num.substring(i, j));
                if (first < 0 || second < 0) continue;

                result.clear();
                result.add(first);
                result.add(second);

                int index = j;
                while (index < n) {
                    int next = first + second;
                    if (next > Integer.MAX_VALUE) break;

                    String nextStr = String.valueOf(next);
                    if (index + nextStr.length() > n || !num.startsWith(nextStr, index)) break;

                    result.add(next);
                    index += nextStr.length();
                    first = second;
                    second = next;
                }

                if (index == n && result.size() >= 3) return result;
            }
        }
        return result;
    }

    private int getInteger(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return -1;
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        FibonacciSplit fs = new FibonacciSplit();
        String num = "123456579";
        List<Integer> fibonacciSequence = fs.splitIntoFibonacci(num);
        
        for (int numInSequence : fibonacciSequence) {
            System.out.print(numInSequence + " ");
        }
    }
}
