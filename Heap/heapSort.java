package Heap;

public class heapSort {

    public static void heapify(int arr[],int i , int size){
        int left = 2*i+1;
        int right = 2*i+2;

        //for ascending order
        // int maxIdxIdx = i;
         // if(left < size && arr[left] > arr[maxIdx]){
        //     maxIdx = left;
        // }
        // if(left < size && arr[right] > arr[maxIdx]){
        //     maxIdx = right;
        // }

        // if(maxIdx != i){
        //     int temp = arr[i];
        //     arr[i] = arr[maxIdx];
        //     arr[maxIdx] = temp;

        //     heapify(arr, 0, i);
        // }
        
        int minIdx = i;
        if(left < size && arr[left] < arr[minIdx]){
            minIdx = left;
        }
        if(left < size && arr[right] < arr[minIdx]){
            minIdx = right;
        }

        if(minIdx != i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, 0, i);
        }

    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for(int i = n/2; i>0;i--){
            heapify(arr,i,n);
        }

        for(int i = n/2;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
    }

    public static void main(String args[]){
        int arr [] = {1,2,4,5,3};
        heapSort(arr);

        for( int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
