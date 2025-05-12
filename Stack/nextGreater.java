import java.util.*;

public class nextGreater {
    public static void nextGreater(int [] arr,int [] ans,int n){
        Stack <Integer> s = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()] <= arr[i]){
                s.pop();

            }
            if(s.empty()){
                ans[i] = -1;
            }
            else{
                ans[i] = arr[s.peek()];
            }
            s.push(i);
            
        }
    }
    public static void main(String[] args){
        int [] arr = {6,8,0,1,3};
        int n = arr.length;
        int [] ans = new int[n];

        nextGreater(arr,ans,n);
        System.out.println("Next greater element for each element in the array is: ");
        //print the ans array
        for(int i=0;i<n;i++){
            System.out.print( ans[i]+" ");
        }

    }
}
