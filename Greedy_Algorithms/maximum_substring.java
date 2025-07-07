package Greedy_Algorithms;

public class maximum_substring {

    public static int maximumSubString(String str){
        int count = 0;
        int maxcount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'L'){
                count++;
            } else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return Math.max(maxcount, count); 
    }
    public static void main(String[] args){
        String str = "LRLRLLLRLLLRRR";
        System.out.println(maximumSubString(str));
    }
}
