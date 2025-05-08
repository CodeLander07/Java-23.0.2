import java.util.*;

public class reverseString {
    public static void main(String[] args){
        String str = "Mayur";

        Stack<Character> stack = new Stack<>();
        for(int i =0; i<str.length();i++){
            stack.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result.toString());

    }
}
