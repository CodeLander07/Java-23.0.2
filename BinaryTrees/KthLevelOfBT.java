public class KthLevelOfBT{
    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void Klevel(Node root,int k, int level){
        if(root == null) return ;
        if(level == k){
            System.out.print(root.data + " ");
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);

    }
    public static void main(String [] args){
        
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        a.right.left = new Node(6);
        a.right.right = new Node(7);
        
        int k = 3;

        Klevel(a, k,1);




    }
}