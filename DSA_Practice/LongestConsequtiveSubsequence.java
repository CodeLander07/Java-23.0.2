import java.util.HashSet;

public class LongestConsequtiveSubsequence {
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        if(n==0) return 0;
        
        // add all values in HashSet
        HashSet<Integer> st = new HashSet<>();
        
        
        for(int num :arr){
            st.add(num);
        }
        
        int res = 0;
        for(int num:arr){
            if(st.contains(num) && !st.contains(num-1)){
               
                int cur = num,cnt=0;
               
                while(st.contains(cur)){
                    st.remove(cur);
                    cur++;
                    cnt++;
                }
                res = Math.max(res,cnt);
            }
        }
        return res;
        
    }
}
    
}