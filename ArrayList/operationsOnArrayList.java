package ArrayList;
import java.util.ArrayList;


public class operationsOnArrayList {


    public static void main(String[] args){

        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();

//Add an element to the ArrayList
        num.add(1);
        num.add(2);
        str.add("Hello");
        str.add("World");
    
        System.out.println(num);
        System.out.println(str);
//get elements in an ArrayList
        num.get(0);
        str.get(0);
//Remove element from ArrayList
        // num.remove(0);
        // str.remove(0);
//Set element at a particular index
        num.set(1 , 4);
        str.set(1 , "MotherFuckers");

        System.out.println(num);
        System.out.println(str);

//check the element in ArrayList

        System.out.println(num.contains(8));
        System.out.println(str.contains("Hello"));
       
    }
}

