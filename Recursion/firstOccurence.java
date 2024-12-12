package Recursion;

public class firstOccurence {
    public static int findkey(int[] arr, int x, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == x){
            return index;
        }
        return findkey(arr, x, index+1);
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = 5;
        System.out.print(findkey(arr, x, 0));
    }
}
