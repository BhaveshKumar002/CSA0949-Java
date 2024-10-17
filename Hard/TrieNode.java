import java.util.HashMap;

class TrieNode {
    HashMap<Character, TrieNode> children = new HashMap<>();
    HashMap<String, Integer> indexMap = new HashMap<>();
}

class WordFilter {
    TrieNode prefixTrie;
    TrieNode suffixTrie;

    public WordFilter(String[] words) {
        prefixTrie = new TrieNode();
        suffixTrie = new TrieNode();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            insert(prefixTrie, word, i);
            insert(suffixTrie, new StringBuilder(word).reverse().toString(), i);
        }
    }

    private void insert(TrieNode trie, String word, int index) {
        for (char ch : word.toCharArray()) {
            if (!trie.children.containsKey(ch)) {
                trie.children.put(ch, new TrieNode());
            }
            trie = trie.children.get(ch);
            trie.indexMap.put(word, index);
        }
        trie.indexMap.put("", index);
    }

    public int f(String pref, String suff) {
        TrieNode prefixNode = getNode(prefixTrie, pref);
        TrieNode suffixNode = getNode(suffixTrie, new StringBuilder(suff).reverse().toString());

        if (prefixNode == null || suffixNode == null) return -1;

        int maxIndex = -1;
        for (String key : prefixNode.indexMap.keySet()) {
            if (key.equals("") || key.length() >= suff.length()) {
                int index = prefixNode.indexMap.get(key);
                if (suffixNode.indexMap.containsKey(key) && index >= 0) {
                    maxIndex = Math.max(maxIndex, index);
                }
            }
        }

        return maxIndex;
    }

    private TrieNode getNode(TrieNode trie, String word) {
        for (char ch : word.toCharArray()) {
            if (!trie.children.containsKey(ch)) return null;
            trie = trie.children.get(ch);
        }
        return trie;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "app", "apricot", "bat", "ball", "basket"};
        WordFilter wordFilter = new WordFilter(words);
        
        System.out.println(wordFilter.f("ap", "e")); 
        System.out.println(wordFilter.f("ba", "t")); 
        System.out.println(wordFilter.f("ba", "s"));
        System.out.println(wordFilter.f("x", "y"));
    }
}
