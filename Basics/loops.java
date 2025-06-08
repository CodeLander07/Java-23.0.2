public class loops {
    public static void main(String [] args){

        System.out.println("Printing 1-5 using loops:");
    
        System.out.println("Using for loop:");
        for(int i = 1;i <= 5;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using while loop:");
        int a = 1;
        while(a <= 5){
            System.out.print(a + " ");
            a++;
        }

        System.out.println();
        int b= 1;
        System.out.println("Using do-while loop:");
        do{
            System.out.print(b + " ");
            b++;
        } while(b <= 5);
    }
}