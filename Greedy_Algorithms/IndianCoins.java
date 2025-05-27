package Greedy_Algorithms;

public class IndianCoins {

    public static void main(String[] args){
        int [] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        int amount = 590;
        int count = 0;

        for(int i = coins.length - 1; i >= 0; i--){
            while(amount >= coins[i]){
                amount -= coins[i];
                count++;
                System.out.println("Coin used: " + coins[i]);
            }
        }
        System.out.println("Minimum number of coins required: " + count);
    }
    
}
