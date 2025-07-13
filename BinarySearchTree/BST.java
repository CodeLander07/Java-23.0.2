package BinarySearchTree;

public class BST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    public static void printBT(Node root){
        if(root == null) return;
        System.out.print(root.data + "->");
        printBT(root.left);
        printBT(root.right);
    }
    public static Node deleteLeafNode(Node root , int target){
        if(root == null ) return null;
        if(root.left == null && root.right == null){
            if(root.data == target) return null;
            else return root;
        }
        root.left = deleteLeafNode(root, target);
        root.right = deleteLeafNode(root, target);

        return root;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(2);
        root.right.right = new Node(4); 

        printBT(root);
    }
}
