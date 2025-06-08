public class prefixSum {
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0]; // First element is the same
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; // Cumulative sum
        }
        
        return prefix;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = prefixSum(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       

        // Print the prefix sum array
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
