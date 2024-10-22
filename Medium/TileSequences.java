import java.util.HashMap;
import java.util.Map;

public class TileSequences {
    public static int numTilePossibilities(String tiles) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int total = 1;
        for (int count : charCount.values()) {
            total *= factorial(count);
        }

        for (int count : charCount.values()) {
            total /= factorial(count - 1);
        }

        return total - 1;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        String tiles = "AAB";
        int numSequences = numTilePossibilities(tiles);
        System.out.println("Number of possible sequences: " + numSequences);
    }
}
