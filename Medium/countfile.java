import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountFileContents {
    public static void main(String[] args) {
        String path = "sample.txt";
        int lines = 0, words = 0, characters = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
                characters += line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
    }
}
