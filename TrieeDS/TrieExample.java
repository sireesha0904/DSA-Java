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

    // Search for a word in the trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }
}

public class TrieExample {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.Insert("sireesha");
        System.out.println(trie.search("sireesha"));
        System.out.println(trie.search("siree"));
    }
}
