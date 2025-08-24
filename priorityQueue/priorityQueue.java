package priorityQueue;
import java.util.PriorityQueue;
public class priorityQueue {
 
    static class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args){
        // Create a priority queue
        PriorityQueue<student> pq = new PriorityQueue<>(); 
        pq.add(new student("Mayur", 1));
        pq.add(new student("Joe", 2));
        pq.add(new student("Homelander", 3));
        pq.add(new student("Dexter", 4));
        pq.add(new student("Billy", 5));

        
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }


    }
}
