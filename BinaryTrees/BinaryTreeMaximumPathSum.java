public class BinaryTreeMaximumPathSum {
    
    static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static int dia = Integer.MIN_VALUE;

    public static int dfs(Node root) {
        if (root == null) return 0;

        int lh = dfs(root.left);
        int rh = dfs(root.right);
        if(lh < 0) lh = 0; // Ignore negative paths
        if(rh < 0) rh = 0; // Ignore negative paths

        dia = Math.max(dia, lh + rh + root.data); // Update diameter

        return Math.max(lh, rh) + root.data;
    }
    public static int maxPathSum(Node root) {
        dfs(root);
        return dia;
    }



    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
    }
}
