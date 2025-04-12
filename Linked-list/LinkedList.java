// Linked List Syntax in Java
public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size = 0;

    public void addFirst(int data) {
        // Step 1: Create a new node with given data
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode; // Corrected initialization
            return;
        }
        // Step 2: new node next = Head
        newNode.next = Head; // linking new node to the current head
        // Step 3: Head = new node
        Head = newNode;
    }

    public void addLast(int data) {
        // Step 1: Create a new node with given data
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode; // Corrected initialization
            return;
        }
        // Step 2: Tail next = new node
        Tail.next = newNode; // linking tail to the new node
        // Step 3: Tail = new node
        Tail = newNode;
    }

    public void printList() {
        Node current = Head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        // Step 1: Traverse the list
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx , int data) {
        // Step 1: Create a new node with given data
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode; 
            return;
        }
        // Step 2: Traverse to the index position
        Node current = Head;
        for (int i = 0; i < idx - 1 && current != null; i++) {
            current = current.next;
        }
        // Step 3: Insert the new node at the index position
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Index out of bounds");
        }
    }
    public void deleteFirst() {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        // Step 1: Move Head to the next node
        Head = Head.next;
    }       
    
    public void deleteLast() {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        // Step 1: Traverse to the second last node
        Node current = Head;
        while (current.next.next != null) {
            current = current.next;
        }
        // Step 2: Set Tail to the second last node and set its next to null
        current.next = null;
        Tail = current;
    }

    public void search(int key){
        int i= 0;
        Node current = Head;
        
        while(current != null){
            if(current.data==key){
                System.out.println("Element found at index: " + i);
                return ; 
            }
            current = current.next;
            i++;
        }
        System.out.println("Element not found in the list");
    }

    public int healper(Node head, int key){
        if(head == null){
            return -1; 
        }
        if(head.data == key){
            return 0; 
        }
        int index = healper(head.next, key); 
        return (index == -1) ? -1 : index + 1; 
    }
    public int recSearch(int key){
        return healper(Head, key);
    }


    public void reverse(){
        Node current = Head;
        Node prev = null;
        Node next = null;
        Tail = Head; // Set Tail to the current Head

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to the next node
        }
        Head = prev; // Set Head to the new first node
    }

    public void deleteNth(int n) {
        if (Head == null || n <= 0) {
            System.out.println("Invalid position or empty list");
            return;
        }
        size--;
        if (n == 1) {
            Head = Head.next; // Remove the first node
            return;
        }
        Node current = Head;
        for (int i = 1; i < n - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next; // Remove the nth node
        } else {
            System.out.println("Position out of bounds");
        }
    }
    public void deleteByValue(int value) {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (Head.data == value) {
            Head = Head.next; // Remove the first node
            return;
        }
        Node current = Head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next; // Remove the node with the given value
        } else {
            System.out.println("Value not found in the list");
        }
    }
    public void deleteNthfromEnd(int n){
        int sz =0;
        Node temp = Head;
        while(temp != null){
            temp = temp.next; 
            sz++;
        }
        if(n == sz){
            Head= Head.next;
            return; 
        }
        int i= 1;
        int iToFind = sz-n;
        Node prev = Head;
        while(i < iToFind){
            prev = prev.next; 
            i++;
        }
        prev.next = prev.next.next; // Remove the nth node from the end
        return;
    }


//check if linked list is palindrome or not
public boolean isPalindrome(){
if(Head == null || Head.next == null){
    return true; 


}

Node midNode = findMid(Head); // Find the middle node

Node prev = null;
Node current = midNode;
Node next ;

while(current != null){
    next = current.next; // Store the next node
    current.next = prev; // Reverse the link
    prev = current; // Move prev to current
    current = next; // Move to the next node
} 
Node right = prev; // Right half of the list
Node left = Head; // Left half of the list

while(right != null){
    if(left.data != right.data){
        return false; 
    }
    left = left.next; // Move to the next node in the left half
    right = right.next; // Move to the next node in the right half
}
return true; // If all nodes matched, it's a palindrome
}

public Node findMid(Node Head){
    Node slow = Head;
    Node fast = Head;

    while(fast != null && fast.next != null){
        slow = slow.next; 
        fast = fast.next.next; 
    }
    return slow;
}


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2); 
        ll.addFirst(1);


        ll.printList(); // Print the list

    //   ll.deleteNthfromEnd(3);
      System.out.println(ll.isPalindrome());
      ll.printList(); // Search for an element in the list
        System.out.println("Size of the list: " + ll.size); // Print the size of the list
    }
}
