package TrieeDS;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode(); // Initialize the root node
    }

    // Insert a word into the trie
    public void Insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
                node = node.children[index];

            }

        }
        node.isEndOfWord = true;
    }
}

public class TrieExample {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.Insert("Sireesha");
    }
}
