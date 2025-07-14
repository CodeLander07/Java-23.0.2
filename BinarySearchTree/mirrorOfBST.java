package BinarySearchTree;
import static BinarySearchTree.BST.*;
public class mirrorOfBST {
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        
        // Swap the left and right children
        Node temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        
        return root;
    }

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7, 9};
        Node root = null;

        for (int i = 0; i < val.length; i++) {
            root = BST.insert(root, val[i]);
        }

        System.out.println("Original Inorder:");
        BST.inorder(root);
        
        root = mirror(root);
        
        System.out.println("\nMirrored Inorder:");
        BST.inorder(root);
    }
}
