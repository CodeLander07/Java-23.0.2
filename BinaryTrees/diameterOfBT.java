public class diameterOfBT {

    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val = val;
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
    // Approach 1 with O(n^2) time complexity
    public static int diameter (Node root){
        if(root == null) return 0;

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        int selfH = lh + rh + 1;

        return Math.max(selfH, Math.max(ld, rd));
    }
    // Approach 2 with O(n) time complexity

    static class Info {
        int ht;
        int dia;

        public Info(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static Info diameter2(Node root){
        if(root == null) return new Info(0, 0);
        Info linfo = diameter2(root.left);
        Info rinfo = diameter2(root.right);

        int diameter = Math.max(linfo.ht + rinfo.ht + 1, Math.max(linfo.dia, rinfo.dia));
        int height = Math.max(linfo.ht, rinfo.ht) + 1;

        return new Info(height, diameter);

    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of the binary tree: " + diameter(root));
        Info result = diameter2(root);
        System.out.println("Diameter of the binary tree (O(n) approach): " + result.dia);
    }
}
