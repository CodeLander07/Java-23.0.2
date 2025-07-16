package BinarySearchTree;
import static BinarySearchTree.BST.*;
import java.util.ArrayList;
 
public class convertBstToBalancedBst {
    public static void Inorder(Node root , ArrayList<Integer> inorder){

        if(root == null) return ;
        Inorder(root.left, inorder);
        inorder.add(root.data);
        Inorder(root.right, inorder);        

    }
    public static Node createBST(ArrayList<Integer> inorder, int st , int end ){
        if(st > end) return null;
        int mid = (st +end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;

    }
    public static Node  BalanceBST(Node root){
        //inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        Inorder(root, inorder);
        // sorted inorder - balanced BST
        root = createBST(inorder, 0, inorder.size() -1);
        return root;

    }
 public static void main(String [] args){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node (12);

        preorder(root);
        root = BalanceBST(root);
        System.out.println();
        preorder(root);
 }   
}
