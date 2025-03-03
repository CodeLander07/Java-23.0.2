package ArrayList;
import java.util.ArrayList;

public class PairSum {
    //for unsorted array
    public static boolean Pairsum1 (ArrayList<Integer> num , int target){
        for(int i = 0; i<num.size(); i++){
            for(int j = i+1; j<num.size(); j++){
                if(num.get(i)+num.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    //for sorted array
    public static boolean Pairsum2 (ArrayList<Integer> num , int target){
        int start = 0;
        int end = num.size()-1;
        while(start<end){
            if(num.get(start)+num.get(end)==target){
                return true;
            }
            else if(num.get(start)+num.get(end)>target){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args){
            ArrayList<Integer> Num = new ArrayList<Integer>();
            Num.add(1);
            Num.add(2);
            Num.add(3);
            Num.add(4);
            Num.add(5); 

            int target = 5;
            System.out.println(Pairsum2(Num, target));
    }
}
