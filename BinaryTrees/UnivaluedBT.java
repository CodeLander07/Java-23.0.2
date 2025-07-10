package BinaryTrees;

public class UnivaluedBT {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isUnivalued(Node root){
        if(root == null) return true;
        if(root.left != null && root.left.data != root.data) return false;
        if(root.right != null && root.right.data != root.data) return false;
        
        boolean left = isUnivalued(root.left);
        boolean right = isUnivalued(root.right);
        
        return left && right;
    }
    public static void main(String [] args){
        Node A = new Node(1);
        A.left = new Node(1);
        A.right = new Node(1);
        A.left.left = new Node(1);
        A.left.right = new Node(1);
        A.right.left = new Node(1);
        A.right.right = new Node(1);

        Node B = new Node(2);
        B.left = new Node(2);
        B.right = new Node(2);
        B.left.left = new Node(2);
        B.left.right = new Node(2);
        B.right.left = new Node(3);

        if(isUnivalued(A) == true){
            System.out.println("The tree is univalued");
        } else {
            System.out.println("The tree is not univalued");
        }

         // false

    }
}
