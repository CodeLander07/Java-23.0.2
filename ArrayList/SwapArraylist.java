package ArrayList;

import java.util.ArrayList;

public class SwapArraylist {
    public static void swap(ArrayList <Integer> num, int idx1, int idx2){
        int temp = num.get(idx1);
        num.set(idx1, num.get(idx2));
        num.set(idx2, temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("Before Swap"+num);
        int idx1 = 1;
        int idx2 = 3;
        swap(num, idx1, idx2);
        System.out.println("After Swap"+num);
    }
}
