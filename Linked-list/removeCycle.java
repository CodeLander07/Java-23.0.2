
class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class removeCycle{
    public static boolean hasCycle(Node head){
        if(head == null) return false; 
        Node slow = head; 
        Node fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 

            if(slow == fast){ 
                return true;
            }
        }
        return false;
    }

    public static void RemoveCycle(Node head){
        if(head == null) return ;
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){ // cycle detected
                cycle = true;
                break;
            }
        }
        if(cycle == false) return; // no cycle

        slow = head; // reset slow to head
        Node prev = null; // to keep track of the node before the cycle start
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null; 
    }
    public static void main(String[] args){
        
       Node head = new Node(1);
       Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // creating a cycle

        System.out.println(hasCycle(head)); // should print true
        RemoveCycle(head); // remove the cycle
        System.out.println(hasCycle(head)); // should print false

    }
    
}