package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
    }
}
public class BinaryTrees{
    
    
    //finds the height of the binary tree
    public static int height(Node root){
        if(root == null) return 0;

        int lefth = height(root.left);
        int righth = height(root.right);

        return Math.max(lefth, righth) + 1;
    }

    //counts the number of nodes in the binary tree
    static int countNodes(Node root){
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    //find the sum of all nodes in the binary tree
    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.val;
    }
public static void main(String[] args){
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);  
    Node f = new Node(6);
    Node g = new Node(7);


    a.left = b; a.right = c;
    b.left = d; b.right = e;
    c.left = f; c.right = g;


    System.out.println(height(a));
    System.out.println(countNodes(a));
    System.out.println(sumOfNodes(a));

} 
}