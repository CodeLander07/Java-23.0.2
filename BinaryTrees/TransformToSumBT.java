public class TransformToSumBT {
        static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }

    }
    public static int SumTree(Node root){
    
    if(root == null){
        return 0;
    } 

    int lc = SumTree(root.left); 
    int rc = SumTree(root.right); 
    int data = root.data;
    int newLeft = root.left == null ? 0 : root.left.data;
    int newRight = root.right == null ? 0 : root.right.data;

    root.data = newLeft + lc + newRight+ rc;

    return data;

    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data + "->");
        preorder(root.left);
        preorder(root.right);
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
        SumTree(a);
        preorder(a);





    }
}
