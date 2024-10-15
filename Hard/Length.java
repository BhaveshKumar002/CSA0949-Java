public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String s = "Hello World"; 
        int length = lengthOfLastWord(s);
        
        System.out.println("Length of the last word: " + length); 
    }
}
