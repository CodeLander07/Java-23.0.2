package Recursion;

public class DecreasingOrder {

    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
        public static void printincreasing(int n)
        {
            if(n==0)
            {
                return;
            }
            printincreasing(n-1);
            System.out.println(n);
        }
    public static void main(String[] args){
        int n = 5;
        // printDecreasing(n);
        printincreasing(n);
    }
}
