package Trees;
// Calculate the Height of the tree 
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class BinaryTreeHeight {
    Node root;

    int CalculateHeight(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = CalculateHeight(node.left);
        int rightHeight = CalculateHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
public class TreeHeightExample {
 public static void main(String[] args) {
     BinaryTreeHeight tree = new BinaryTreeHeight();
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);

     int result = tree.CalculateHeight(tree.root);
     System.out.println("Height of the tree is: " + result);
 }
}
