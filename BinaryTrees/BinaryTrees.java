package BinaryTrees;


class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
    }
}
public class BinaryTrees{
    public static void print(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);

    }
public static void main(String[] args){
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);  
    Node f = new Node(60);
    Node g = new Node(70);


    a.left = b; a.right = c;
    b.left = d; b.right = e;
    c.left = f; c.right = g;


    print(a);

} 
}