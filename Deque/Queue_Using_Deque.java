package Deque;
import java.util.*;
public class Queue_Using_Deque {
    public static class Queue {
        private Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int x) {
            deque.addLast(x);
        }

        public int dequeue() {
            if (deque.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return deque.removeFirst();
        }

        public int peek() {
            if (deque.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return deque.peekFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int size() {
            return deque.size();
        }
    }
    public static void main(String [] args){
        Queue queue = new Queue();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Print queue
        System.out.println("Queue: " + queue.deque);

        // Dequeue element
        System.out.println("Dequeued: " + queue.dequeue());

        // Peek element
        System.out.println("Front: " + queue.peek());
    }
}
