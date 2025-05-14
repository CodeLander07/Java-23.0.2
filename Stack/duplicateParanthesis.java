
import java.util.*;
public class duplicateParanthesis {
    
    
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        boolean flag = true;

        // TRAVERSE ALL CHARACTER STRING
        for (Character c : str.toCharArray()) {
            if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                if (s.isEmpty()) {
                    flag = false;
                    break;
                }
                if (s.peek() == '(') {
                    s.pop();
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag && s.isEmpty();
    }
    public static void main(String[] args ){
        String str = "((a+b))";
        boolean result = isValid(str);
        System.out.println("Does the string have duplicate parentheses? " + result);
    }
}