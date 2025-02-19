package ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class MultiDimentionalArraylist {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> num  = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num.add(num1);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(3);
        num2.add(4);
        num.add(num2);

        for(int i = 0; i<num.size(); i++){
            ArrayList<Integer> temp = num.get(i);
            for(int j = 0; j<temp.size(); j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();

        }
        System.out.println(num);
    }
}
