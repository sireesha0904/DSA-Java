package Trees;

public class BuildBST {
    
    // Node class to represent each node in the BST
    static class Node {
        int key; // Value of the node (data)
        Node left, right;

        // Constructor to initialize the node
        Node(int value) {
            key = value;
            left = right = null;
        }
    }

    // BinarySearch class to implement BST operations
    class BinarySearch {
        Node root;

        // Constructor to initialize an empty tree
        BinarySearch() {
            root = null;
        }

        // A recursive function to insert a new key in the BST
        Node insertRec(Node root, int key) {
            // If the tree is empty, create a new node and return it
            if (root == null) {
                root = new Node(key);
                return root;
            }
            // Otherwise, traverse the tree and insert the key
            if (key < root.key) {
                root.left = insertRec(root.left, key); // Insert in the left subtree
            } else if (key > root.key) {
                root.right = insertRec(root.right, key); // Insert in the right subtree
            }
            return root;
        }

        // Wrapper function to insert a new key
        void insert(int data) {
            root = insertRec(root, data); // Start inserting from the root
        }

        // Inorder traversal of the BST (Left, Root, Right)
        void inorder(Node root) {
            if (root != null) {
                inorder(root.left); // Traverse the left subtree
                System.out.print(root.key + " "); // Print the root key
                inorder(root.right); // Traverse the right subtree
            }
        }

        // Wrapper function for inorder traversal (calls the recursive function)
        void inorder() {
            inorder(root);
        }
    }

    public static void main(String[] args) {
        BuildBST bst = new BuildBST(); // Create an instance of the BuildBST class
        BinarySearch tree = bst.new BinarySearch(); // Create a new BinarySearch object

        // Insert values into the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform inorder traversal and print the result
        System.out.println("Inorder Traversal:");
        tree.inorder(); // Expected Output: 20 30 40 50 60 70 80
    }
}
