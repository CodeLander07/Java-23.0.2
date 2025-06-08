
import java.util.Scanner;

public class primeno{
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Found a divisor, not prime
        }
        return true; // No divisors found, it's prime
    }
    public static void main(String[] args){
        
        Scanner imp = new Scanner(System.in);

        System.out.println("FIND GIVEN NO. IS PRIME OR NOT");
        System.out.print("Enter the number:");
        int a = imp.nextInt();
        
        if (isPrime(a)) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }


    }
}
