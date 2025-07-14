package BinaryTrees;

import BinaryTrees.BinaryTreeUtils.Node;
import static BinaryTrees.BinaryTreeUtils.printInOrder;

public class InvertBT {
    public static void main(String[] args) {
        Node root = new Node(1);  // Now cleaner!

        root.left = new Node(2);    
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        printInOrder(root);
    }
}
