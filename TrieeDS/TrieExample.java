package TrieeDS;

import java.util.TreeMap;

import javax.swing.tree.TreeNode;

// Program for insert and search 
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
  
}

public class TrieExample {
    public static void main(String[] args) {
        Trie trie = new Trie();
        
    }
}
