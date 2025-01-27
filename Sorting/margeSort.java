package Sorting;

public class margeSort {

    public static void Printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MS(int arr[] , int si ,int li){
        
        if(si==li){
            return;
        }
        int mid = si+(li -si)/2;
        MS(arr, si, mid);
        MS(arr, mid+1,li);
        mearge(arr,si, mid+1,li);
        
    }
    public static void mearge(int arr[],int si ,int mid ,int li){
        int n = li-si+1; //size of array
        int temp[] = new int[n]; //temp array to store the sorted array
        int i = si;//iterator for left array
        int j = mid;//iterator for right array
        int k = 0;//iterator for temp array

        while(i<mid && j<=li){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=li){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l<n; l++){
            arr[si+l] = temp[l];
        }
    }
    public static void main(String[] args){
        int arr [] ={2,1,4,3,6,5,8,7};
        MS(arr, 0, arr.length-1);
        Printarr(arr); 
    }
}
