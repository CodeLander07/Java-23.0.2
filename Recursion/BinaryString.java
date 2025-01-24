import java.util.Scanner;

public class BinaryString {
    public static void binaryString(int n, int lastPlace, String Str) {
        if (n == 0) {
            System.out.println("Given input is empty");
            return;
        }
        binaryString(n-1 , 0 , Str+"0");
        if(lastPlace == 0){
            binaryString(n-1 , 1 , Str+"1");
        }
    } 
    public static void main(String[] args) {

        
            binaryString(2, "");
        
    }
    
}
