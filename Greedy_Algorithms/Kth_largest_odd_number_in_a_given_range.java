package Greedy_Algorithms;

public class Kth_largest_odd_number_in_a_given_range {
    public static int laregetsOdd(int x, int y, int k) {
        if (x > y) {
            return -1; // Invalid range
        }

       
        if (x % 2 == 0) {
            x++;
        }

        // Calculate the number of odd numbers in the range
        int count = (y - x) / 2 + 1;

       
        if (k > count) {
            return -1;
        }

        // Calculate the kth largest odd number
        return y - (k - 1) * 2;
    }
    public static void main(String[] args){
        int k = 1, l = -3, r = 3;

        System.out.println(laregetsOdd(l, r, k)); // Output: 3
    }
}
