import java.util.*;
public class validParanthesis {

    public boolean isValid(String s) {
        if(s.length()%2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        boolean flag = true;

             for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                flag = false; 
                break;
            }
        }
        return flag && stack.isEmpty();
    }
    public static void main(String[] args) {
        validParanthesis obj = new validParanthesis();
        String s = "))";
        boolean result = obj.isValid(s);
        System.out.println("Is the string valid? " + result);
    }
}

