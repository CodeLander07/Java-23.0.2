public class MinDistBtnTwoNodesBT {
    
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }

    }
   
    public static Node lca(Node root,int n1,int n2){
         
        if(root == null || root.data == n1 || root.data ==n2) return root;
        
        Node lLca = lca(root.left , n1,n2);
        Node rLca = lca(root.right , n1,n2);

        if(rLca == null) return lLca;
        if(lLca == null) return rLca;
        

        return root;
    }

    public static int lcaDist(Node lca, int n){
         if(lca == null){
            return -1;
        }
        if(lca.data == n){
            return 0;
        }

        int lDist = lcaDist(lca.right, n);
        int rDist = lcaDist(lca.right, n);
        
        if(lDist == -1 && rDist == -1){
            return -1;
        }
        else if(lDist == -1){
            return rDist+1;
        }
        else{
            return lDist+1;
        }
    }

    public static int MIBTN(Node root, int n1 , int n2){
       Node lca = lca(root,n1,n2);
        int d1 = lcaDist(lca , n1);
        int d2 = lcaDist(lca , n2);
        
        return d1 +d2;
    }
    public static void main(String [] args){
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        a.right.left = new Node(6);
        a.right.right = new Node(7);
        
        int n1 = 4 , n2 = 7;
        // System.out.print(lca(a,n1,n2).data);
        System.out.print(MIBTN(a, n1, n2));
    }
}
