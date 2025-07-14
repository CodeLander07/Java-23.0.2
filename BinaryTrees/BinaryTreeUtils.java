package BinaryTrees;

public class BinaryTreeUtils {

    public static class Node {
        public int val;
        public Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

public static void printBT(Node root) {
    if (root == null) {
        return;
    }
    System.out.print(root.val + " ");
    printBT(root.left);
    printBT(root.right);
}

}
