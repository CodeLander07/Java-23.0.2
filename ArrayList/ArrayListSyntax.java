package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListSyntax{
    public static void main(String[] args){

        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Boolean> bool = new ArrayList<Boolean>();
        ArrayList<Character> ch = new ArrayList<Character>();


        num.add(1);
        num.add(2);
        str.add("Hello");
        str.add("World");

        System.out.println(num);
        System.out.println(str);
    }
}
