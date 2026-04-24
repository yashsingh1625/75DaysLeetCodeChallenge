class Trie {

    // Trie Node
    class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        public TrieNode() {
            children = new TrieNode[26]; // for 'a' to 'z'
            isEnd = false;
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }

            node = node.children[index];
        }
        node.isEnd = true;
    }

    // Search a complete word
    public boolean search(String word) {
        TrieNode node = traverse(word);
        return node != null && node.isEnd;
    }

    // Check if prefix exists
    public boolean startsWith(String prefix) {
        return traverse(prefix) != null;
    }

    // Helper function
    private TrieNode traverse(String str) {
        TrieNode node = root;

        for (char ch : str.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return null;
            }

            node = node.children[index];
        }

        return node;
    }
}