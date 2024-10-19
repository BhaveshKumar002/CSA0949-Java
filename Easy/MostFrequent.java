import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the paragraph: ");
        String paragraph = sc.nextLine();

        System.out.print("Enter the banned words (comma-separated): ");
        String[] banned = sc.nextLine().split(",");

        String result = mostFrequentWord(paragraph, banned);
        System.out.println(result);
    }

    public static String mostFrequentWord(String paragraph, String[] banned) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        HashMap<String, Boolean> bannedWords = new HashMap<>();

        for (String word : banned) {
            bannedWords.put(word.trim().toLowerCase(), true);
        }

        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        for (String word : words) {
            if (!bannedWords.containsKey(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return capitalizeFirstLetter(mostFrequentWord);
    }

    public static String capitalizeFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
