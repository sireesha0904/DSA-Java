package Trees;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class BinaryTreeNode {
    Node root;

    // Inorder Traversal (Left, Root, Right)
    void InOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
         InOrderTraversal(node.left);
            System.out.print(node.data + " ");
            InOrderTraversal(node.right);
    }
    // PreOrder Traversal(Root, Left, Right)
    void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
         System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
    }
    // PostOrder Traversal (Left, Right, Root)
    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
           postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
    }
}
public class TreeTraversalDemo {
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
       
        System.out.println("Inorder Traversal: ");
        tree.InOrderTraversal(tree.root);

        System.out.println("\nPreorder Traversal: ");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nPostorder Traversal: ");
        tree.postOrderTraversal(tree.root);
    }
}
