public class KthAncestor {
        static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }

    }
    public static int KAncestor(Node root , int n , int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int lDist = KAncestor(root.left, n, k);
        int rDist = KAncestor(root.right, n, k);

        if(lDist == -1 && rDist == -1){
            return -1;
        }
        int max = Math.max(lDist , rDist);
        if(max +1 == k){
           System.out.print(root.data);
        }
        return max+1;
    }
       public static void main(String [] args){
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        a.right.left = new Node(6);
        a.right.right = new Node(7);
        
        int n1 = 4 , k = 1;
        KAncestor(a, n1, k);



    }
}
