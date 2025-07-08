package BinaryTrees;


public class BuildBinaryTree {
    static class Node {
            int data;
            Node left, right;
            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

    public static Node buildTree(int[] nodes) {
        return buildTreeHelper(nodes, new int[]{0});
    }
    private static Node buildTreeHelper(int[] nodes, int[] index) {
        if (index[0] >= nodes.length || nodes[index[0]] == -1) {
            index[0]++;
            return null;
        }

        Node node = new Node(nodes[index[0]++]);
        node.left = buildTreeHelper(nodes, index);
        node.right = buildTreeHelper(nodes, index);
        return node;
    }
    public static void printTree(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,-1,6,-1,-1};
        Node root = buildTree(nodes);
        printTree(root);
    }
}

