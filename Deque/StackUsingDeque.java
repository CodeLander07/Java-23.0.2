package Deque;
import java.util.*;
public class StackUsingDeque {
    public class Stack {
        private Deque<Integer> stack = new LinkedList<>();

        public void push(int x) {
            stack.addFirst(x);
        }
        public int pop() {
            if (stack.isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return stack.removeFirst();
        }
        public int peek() {
            if (stack.isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return stack.peekFirst();
        }
        public boolean isEmpty() {
            return stack.isEmpty();
        }
        public int size() {
            return stack.size();
        }
    }
    public static void main(String [] args){
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);


        // Print stack
        System.out.println("Stack: " + stack);
        // Pop element
        System.out.println("Popped: " + stack.removeFirst());

        // Peek element
        System.out.println("Top: " + stack.peekFirst());
    }
}
