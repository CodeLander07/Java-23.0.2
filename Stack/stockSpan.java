import java.util.*;

public class stockSpan {

    public static void calculateSpan(int [] arr,int [] span,int n){
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);
        for(int i = 1;i<n;i++){
            int curr = arr[i];
            while(!s.empty()&& curr > arr[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - s.peek();
            }
            s.push(i);
        }


    }
    public static void main(String[] args){
        int [] arr = {100,80,60,70,60,75,85};
        int n = arr.length;
        int [] span = new int[n];
        calculateSpan(arr,span, n);
        //print the span array
        for(int i=0;i<n;i++){
            System.out.print(span[i]+" ");
        }

    }
}
