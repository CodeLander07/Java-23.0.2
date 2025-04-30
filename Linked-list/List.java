

//This is program of practice session
class ListNode{
    int val;
    ListNode next;
    
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class List {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        ListNode head = n1;
        ListNode current = head;
        
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    } 
}
