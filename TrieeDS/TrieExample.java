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
}

public class TrieExample {
    public static void main(String[] args) {
        
    }
}
