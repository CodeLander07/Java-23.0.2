public class BinaryString {
    public static void binaryString(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        binaryString(n - 1, s + "0");
        binaryString(n - 1, s + "1");
    } 
    public static void main(String[] args) {
        binaryString(3, "");
    }
    
}
