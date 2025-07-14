package BinaryTrees;

import BinaryTrees.BinaryTreeUtils;
import BinaryTrees.BinaryTreeUtils.Node;

public class deleteLeafNode {

    public static Node deleteLeafNode(Node root, int target) {
        if (root == null) return null;

        // If it's a leaf node and its value matches the target
        if (root.left == null && root.right == null) {
            if (root.val == target) return null;
            else return root;
        }

        // Recursive calls
        root.left = deleteLeafNode(root.left, target);
        root.right = deleteLeafNode(root.right, target);

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 4;
        root = deleteLeafNode(root, target);

        System.out.print("Inorder after deleting leaf node: ");
        BinaryTreeUtils.printInOrder(root); // Optional if you imported statically
    }
}
