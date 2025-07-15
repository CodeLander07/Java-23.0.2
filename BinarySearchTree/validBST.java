package BinarySearchTree;
import static BinarySearchTree.BST.*;

import javax.swing.tree.TreeNode;

import BinarySearchTree.BST.Node;

public class validBST {
    int preval;
    boolean isPreval;
    boolean flag;
    public void DFS(Node root){
        if(root != null){
            DFS(root.left);
            if(this.isPreval == false) this.isPreval = true;
            else{
                if(root.data <= this.preval){
                    this.flag = false;
                }
            }
            this.preval = root.data;
            DFS(root.right);

        }
    }
    public boolean isValidBST(Node root) {
        
        this.flag =true ;
        this.isPreval = false;
        DFS(root);
        return this.flag;
        }

    public static void main(String[] args) {
        Node root = new Node(5);
        insert(root, 3);
        insert(root, 7);
        insert(root, 2);
        insert(root, 4);
        
        validBST validator = new validBST();
        System.out.println(validator.isValidBST(root)); 
    }
}
