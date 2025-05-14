import java.util.*;


public class trappingRainWater {

    public static int trap(int arr[]){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int ans = 0;

        for(int r= 0;r<n;r++){
            while(s.isEmpty() == false && arr[s.peek()] < arr[r]){
                int top = s.pop();
                if(s.isEmpty()==true) break;
                int l = s.peek();
                int h = Math.min(arr[l], arr[r]) - arr[top];
                ans += (r - l - 1) * h;
                
            }
            s.push(r);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
