import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        String fileName = "input.txt"; 
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                charCount += line.length();
                wordCount += countWords(line);
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }

    private static int countWords(String line) {
        String[] words = line.trim().split("\\s+");
        return words.length;
    }
}
