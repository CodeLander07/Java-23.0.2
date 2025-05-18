package Deque;
import java.util.*;
public class DoubleEndedQueue {
    public static void main(String [] args){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        //get First and getLast
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        //remove First and removeLast
        dq.removeFirst();
        dq.removeLast();

        //peek First and peekLast
        System.out.println(dq);
    }
}
