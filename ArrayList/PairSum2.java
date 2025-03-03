package ArrayList;
import java.util.ArrayList;

public class PairSum2 {
    public static boolean Pairsum2 (ArrayList<Integer> num , int target){
        int BP = -1;
        for(int i= 0; i<num.size(); i++){
            if(num.get(i)  > num.get(i+1)){
                BP = i;
                break;
            }
        }
        int lp = BP+1;
        int rp = BP;
        int n= num.size();
        while(lp!=rp){
            if(num.get(lp) + num.get(rp) == target){
                return true;
            }
            else if(num.get(lp) + num.get(rp) < target){
                lp = (lp+1) % num.size();
            }
            else{
                rp = (num.size() + rp - 1) % num.size();
            }
        }
        return false;
    }
    
public static void main(String[] args)
{
    ArrayList<Integer> Num = new ArrayList<Integer>();
    Num.add(11);
    Num.add(15);
    Num.add(6);
    Num.add(8);
    Num.add(10); 

    int target = 21;
    System.out.println(Pairsum2(Num, target));
}
}
