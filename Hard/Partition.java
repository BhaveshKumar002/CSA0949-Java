public class PalindromePartitioning {
    
    public static int minCuts(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        boolean[][] isPalindrome = new boolean[n][n];
        int[] cuts = new int[n];
        
        for (int i = 0; i < n; i++) {
            cuts[i] = i; 
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 2 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;
                    cuts[i] = j == 0 ? 0 : Math.min(cuts[i], cuts[j - 1] + 1);
                }
            }
        }
        
        return cuts[n - 1];
    }
    
    public static void main(String[] args) {
        String s = "aabbc";
        int result = minCuts(s);
        System.out.println("Minimum cuts needed for palindrome partitioning: " + result);
    }
}
