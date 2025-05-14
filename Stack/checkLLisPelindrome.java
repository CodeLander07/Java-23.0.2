import java.util.LinkedList;
import java.util.Stack;

public class checkLLisPelindrome {
    public static boolean isPalindrome(LinkedList<Integer> list) {
        
        Stack<Integer> stack = new Stack<>();

        
        for (int num : list) {
            stack.push(num);
        }

        for (int num : list) {
            if (num != stack.pop()) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        System.out.println("Is palindrome? " + isPalindrome(list)); 
    }
}