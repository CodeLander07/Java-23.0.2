package BinarySearchTree;
import static BinarySearchTree.BST.*;

import BinarySearchTree.BST.Node;

public class deletenodeInBST {
    public static Node delete(Node root, int val) {
       if(root.data < val){
        root.right = delete(root.right, val);
       }
       else if(root.data > val){
        root.left = delete(root.left , val);
       }
       else{
        if(root.left == null && root.right == null){
            return null;
        }
        if(root.left == null){
            return root.left;
        }
        else if(root.right == null){
            return root.left;
        }
        Node IS = findInorderSuccessor(root);
        root.data = IS.data;
        root.right = delete(root.right, val);
       }
       return root;
    }
    public static void main(String[] args){
        int val [] = {5, 1, 3, 4, 2, 7, 9};
        Node root = null;

       for(int i= 0;i<val.length;i++) root = insert(root, val[i]);

       inorder(root);
       delete(root, 2);
       System.out.println();
       inorder(root);
       
      
    }
    
}
