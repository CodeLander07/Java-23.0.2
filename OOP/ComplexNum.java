package OOP;
import java.util.*;
public class ComplexNum {
	int real ;
    int img;

    // consturtor fuction to initialize the values
    public complex(int real , int img){
        this.real = real;
        this.img = img;
    }
    public void print(){
        System.out.println(this.real + " + i" +this.img);
    }
    
    public static void add(ComplexNum c1 , ComplexNum c2){
        int real = c1.real + c2.real;
        int img = c1.img + c2.img;
        System.out.println(real + " + i" + img);
    }
}
