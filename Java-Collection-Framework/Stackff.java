import java.util.*;

public class Stackff {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while(stack.isEmpty() == false){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}