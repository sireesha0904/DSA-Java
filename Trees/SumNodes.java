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

class BinaryTreeSumNodes {
    Node root;

    int sumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data +  sumOfNodes(node.left) + sumOfNodes(node.right);
    }
}
public class SumNodes {
    public static void main(String[] args) {
        BinaryTreeSumNodes tree = new BinaryTreeSumNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int result = tree.sumOfNodes(tree.root);
        System.out.println("Sum of nodes in the tree: " + result);

    }
}
