package BinarySearchTree;
import static BinarySearchTree.BST.*;
public class SortedArrayToBST {

    public static Node createBst(int arr[], int st,int end){
        if(st > end) return null;
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, st, mid-1);
        root.right = createBst(arr, mid+1, end);
        return root;
    }
    
}
