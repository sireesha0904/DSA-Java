package Trees;

class Node {
    int data;
    Node left, right;

    //Construct
    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class BinaryTreeCountNodes {
    Node root;

    int count(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + count(node.left) + count(node.right);
    }
}
public class CountNodes {
    public static void main(String[] args) {
        BinaryTreeCountNodes tree = new BinaryTreeCountNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int result = tree.count(tree.root);
        System.out.println("Number of nodes in the tree: " + result);
    }
}
