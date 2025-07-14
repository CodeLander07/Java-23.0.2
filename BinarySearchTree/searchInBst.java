package BinarySearchTree;

import static BinarySearchTree.BST.*;

public class searchInBst {

    public static boolean search(Node root, int key) {
        // Base case: if the root is null, the key is not found
        if (root == null) return false;
        
        // If the current node's data matches the key, return true
        if (root.data == key) return true;
        
        // If the key is less than the current node's data, search in the left subtree
        if (key < root.data) return search(root.left, key);
        
        // Otherwise, search in the right subtree
        return search(root.right, key);
    }

}