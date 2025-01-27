package Sorting;

public class QuickSort {
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
    
        int pix = Partition(arr , si ,ei);
        quickSort(arr, si, pix-1); //left
        quickSort(arr, pix+1, ei); //right

        
    }
    public static int Partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args){
        int arr [] = {10,25,8,6,9,7,3,2,1,5,4};
        quickSort(arr, 0, arr.length-1);
        PrintArray(arr);
    }
}
