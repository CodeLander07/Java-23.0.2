import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("C");
        ll.addFirst("B");
        ll.addFirst("A");

        ll.addLast("D");
        ll.addLast("E");
        ll.addLast("F");

        System.out.println("Linked List: " + ll);
    }
}