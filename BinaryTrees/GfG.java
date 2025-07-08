package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    // Constructor to initialize a new node
    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class GfG {
    void levelOrderRec(Node root, int level, List<List<Integer>> res) {
        // Base case: If node is null, return
        if (root == null) return;

        // Add a new level to the result if needed
        if (res.size() <= level)
            res.add(new ArrayList<>());

        // Add current node's data to its corresponding level
        res.get(level).add(root.data);

        // Recur for left and right children
        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }

    // Function to perform level order traversal
    List<List<Integer>> levelOrder(Node root) {
        // Stores the result level by level
        List<List<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }

    public static void main(String[] args) {
        //      5
        //     / \
        //   12   13
        //   /  \    \
        //  7    14    2
        // /  \   /  \  / \
        //17  23 27  3  8  11

        Node root = new Node(1);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        GfG tree = new GfG();
        List<List<Integer>> res = tree.levelOrder(root);

        for (List<Integer> level : res) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i < level.size() - 1) System.out.print(", ");
            }
            System.out.print("] ");
        }
    }
}