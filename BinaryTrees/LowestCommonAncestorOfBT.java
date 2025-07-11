import java.util.*;
public class LowestCommonAncestorOfBT {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }

    }

    // Approach1

    // public static boolean getpath(Node root, int n , ArrayList<Node> path){
        
    //     if(root == null){
    //         return true;
    //     }
    //     path.add(root);
    //     if(root.data == n){
    //         return true;
    //     }
    //     boolean fl = getpath(root.left, n, path);
    //     boolean fr = getpath(root.right, n, path);
    //     if(fl || fr){
    //         return true;
    //     }
    //     path.remove(path.size()-1);

    //     return false;

    // }
    
    // public static Node lca(Node root, int n1, int n2){
    //    ArrayList<Node> path1 = new ArrayList<>();
    //    ArrayList<Node> path2 = new ArrayList<>();


    //    getpath(root,n1,path1);
    //    getpath(root,n2,path2);

    //    int i = 0;
    //    for(; i<path1.size() && i< path2.size();i++){
    //     if(path1.get(i) != path2.get(i)){
    //         break;
    //     }
    //    }
    //    Node lca = path1.get(i-1);
    //    return lca;
    // }

    public static Node lca(Node root,int n1,int n2){
         
        if(root == null || root.data == n1 || root.data ==n2) return root;
        
        Node lLca = lca(root.left , n1,n2);
        Node rLca = lca(root.right , n1,n2);

        if(rLca == null) return lLca;
        if(lLca == null) return rLca;
        

        return root;
    }
    public static void main(String [] args){
         Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        // a.right.left = new Node(6);
        // a.right.right = new Node(7);
        
        int n1 = 4 , n2 = 5;
        System.out.print(lca(a,n1,n2).data);
    }
}
