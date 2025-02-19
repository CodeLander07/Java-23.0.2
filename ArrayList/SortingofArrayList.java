package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class SortingofArrayList {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(3);
        num.add(1);
        num.add(4);
        num.add(2);
        System.out.println("Before Sorting"+num);

        //it sort ArryList in ascending order 
        Collections.sort(num);
        System.out.println("After Sorting"+num);

        //it sort ArryList in descending order
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("After Sorting in descending order"+num);
    }
}
