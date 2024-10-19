import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello world hello";
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : str.toLowerCase().split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }
}
