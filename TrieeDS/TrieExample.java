package TrieeDS;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode(); 
    }

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toLowerCase().toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode(); //  Create new node if it does not exist
            }
            node = node.children[index]; // Move to the next node
        }
        node.isEndOfWord = true; // mark the end of word
    }

    // Search for a word in the trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toLowerCase().toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    // Search for a prefix in the trie
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toLowerCase().toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
}

public class TrieExample {
    public static void main(String[] args) {
        Trie trie = new Trie();
        
        trie.insert("sireesha");
        trie.insert("siree");
        trie.insert("sir");

        System.out.println("Search 'sireesha': " + trie.search("sireesha")); // true
        System.out.println("Search 'siree': " + trie.search("siree"));       // true
        System.out.println("Search 'sir': " + trie.search("sir"));           // true
        System.out.println("Search 'sire': " + trie.search("sire"));         // false

        System.out.println("Prefix 'sire': " + trie.startsWith("sire")); // true
        System.out.println("Prefix 'si': " + trie.startsWith("si"));     // true
        System.out.println("Prefix 'sir': " + trie.startsWith("sir"));   // true
        System.out.println("Prefix 'ree': " + trie.startsWith("ree"));   // false

    }
}
