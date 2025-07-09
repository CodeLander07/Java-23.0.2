package BinaryTrees;

public class checkSubtree {
        static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Approach 1: Check if the subtree is identical to the root
    public static boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null) return true;
        if(node == null || subroot == null || node.data != subroot.data) return false;

        boolean left = isIdentical(node.left, subroot.left);
        boolean right = isIdentical(node.right, subroot.right);

        return left && right;
        
    }

    public static boolean isSubtree(Node root, Node subroot){

        if(root.data == subroot.data) {
            if(isIdentical(root, subroot)) return true;
        }
        boolean lAns = isSubtree(root, subroot);
        boolean rAns = isSubtree(root, subroot);

        return lAns || rAns;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       
        //      1
        //     / \
        //    2   3
        //   / \    
        //  4   5

        
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        //      2
        //     / \
        //    4   5


    }
}
