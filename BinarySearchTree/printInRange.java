package BinarySearchTree;
import static BinarySearchTree.BST.*;
// import BinarySearchTree.BST.Node;


public class printInRange {
    public static void printinRange(Node root, int k , int k1){
        if(root == null){
            return ;
        }
        if(root.data >= k && root.data <= k1){
            printinRange(root.left, k, k1);
            System.out.print(root.data + " ");
            printinRange(root.right, k, k1);
        }
        else if(root.data <=k1 ){
                printinRange(root.left, k, k1);
        }
        else{
            printinRange(root.right, k, k1);
        }
    }
    public static void main(String [] args){
    int val [] = {5, 1, 3, 4, 2, 7, 9};
        Node root = null;

       for(int i= 0;i<val.length;i++) root = insert(root, val[i]);

       int k = 1;
       int k1 = 4;
       printinRange(root, k, k1);
}
    
}
