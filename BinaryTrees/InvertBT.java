public class InvertBT {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void dfs(Node root){
        if( root == null) return;
        dfs(root.left);
        dfs(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

   public static Node invertTree(Node root){
    dfs(root);
    return root;
   } 
    public static void printBT(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printBT(root.left);
        printBT(root.right);
    }

    public static void main(String[] args) {
        Node A = new Node(1);
        A.left = new Node(2);
        A.right = new Node(3);
        A.left.left = new Node(4);
        A.left.right = new Node(5);

    //   Node inverted =  invertTree(A);
        printBT(A);
        // The tree is now inverted
    }
}