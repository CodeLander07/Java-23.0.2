package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseOfArrayList{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        int n = num.size();
        for(int i=n-1; i>=0; i--){
            System.out.print(num.get(i)+" ");;
        }

    }
}