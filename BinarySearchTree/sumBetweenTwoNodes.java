package BinarySearchTree;
import java.util.Stack;
import static BinarySearchTree.BST.*;
import javax.swing.tree.TreeNode;

public class sumBetweenTwoNodes {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.sum = 0;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;

        while(st.size() > 0 || curr != null){
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            int data = curr.data;

            if(data >= low && data <= high){
                this.sum = this.sum + curr.data;

            }
            curr = curr.data;
        }
        return this.sum;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 18);

        sumBetweenTwoNodes solution = new sumBetweenTwoNodes();
        int low = 7;
        int high = 15;
        int result = solution.rangeSumBST(root, low, high);
        System.out.println("Sum of values between " + low + " and " + high + ": " + result); // Output: 32
    }
}
