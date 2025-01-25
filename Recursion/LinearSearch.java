public class LinearSearch {
   public static void linearSearch(int arr[], int key, int end){
        if(end < 0) return; //base case
        
        linearSearch(arr, key, end-1);
        
        if(arr[end] == key){
            System.out.println(end);
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2,5,4,2,2,2,4,7,9};
        int key = 2;
        linearSearch(arr, key, arr.length-1);
    }
    
}
