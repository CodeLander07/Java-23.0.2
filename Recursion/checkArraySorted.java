package Recursion;

public class checkArraySorted {
    public static boolean checkSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && checkSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 6, 5};
        System.out.println(checkSorted(arr, 0));
    }
}
