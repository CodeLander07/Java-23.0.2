package Recursion;

public class LastOccurance {
    public static int lastOccurance(int[] arr, int x, int index){
        if(index == arr.length){
            return -1;
        }
        int index1 = lastOccurance(arr, x, index+1);
        if(index1 == -1){
            if(arr[index] == x){
                return index;
            }else{
                return -1;
            }
        }else{
            return index1;
        }
    }
    public static void main(String[] args){
        int[] arr = {3,8,1,8,8,7};
        int x = 8;
        int index = 0;
        System.out.print(lastOccurance(arr, x, index));
    }
    
}
