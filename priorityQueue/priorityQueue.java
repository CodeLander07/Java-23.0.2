package priorityQueue;
import java.util.*;
public class priorityQueue {
 
    public class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2) {
            return Integer.compare(this.rank, s2.rank);
        }
    }
    public static void main(String[] args){
        // Create a priority queue
        PriorityQueue<student> pq = new PriorityQueue<>(); 

        student s1 = new priorityQueue().new student("Alice", 2);
        student s2 = new priorityQueue().new student("Bob", 1);
        student s3 = new priorityQueue().new student("Charlie", 3);
        student s4 = new priorityQueue().new student("David", 5);

        // Add elements to the priority queue
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);




        // // Add elements to the priority queue
        // pq.add(10);
        // pq.add(20);
        // pq.add(15);
        // pq.add(30);

        // // Display the elements in the priority queue
        // System.out.println("Priority Queue: " + pq);

        // // Remove the highest priority element (the root of the heap)
        // int highestPriority = pq.poll();
        // System.out.println("Removed highest priority element: " + highestPriority);

        // // Display the remaining elements in the priority queue
        // System.out.println("Priority Queue after removal: " + pq);
    }
}
