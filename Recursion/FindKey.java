public class FindKey {
    public static int findkey(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if(arr[index] == key){
            System.out.print(index + " "); 
        }
        return findkey(arr, key , index + 1 );
        
    }

    public static void main(String[] args){
        int arr[] = {1,2,5,4,7,2,2,6,2};
        int key = 2;
        int index = 0;
        findkey(arr, key, index);
    }
}
