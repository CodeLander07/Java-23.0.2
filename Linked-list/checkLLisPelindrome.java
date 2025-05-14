import java.util.LinkedList;


public class checkLLisPelindrome {


    public static boolean isPelindrome(LinkedList<Integer> list) {
     
        LinkedList<Integer> reversedList = new LinkedList<>(list);
        
        // Reverse the copied list
        java.util.Collections.reverse(reversedList);
        
    
        boolean res = list.equals(reversedList);
        return res;

    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(isPelindrome(list));
    }

}
