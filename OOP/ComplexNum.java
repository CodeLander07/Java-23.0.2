package OOP;

public class ComplexNum{
    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    // function to add two complex numbers
    public static Complex add(Complex c1, Complex c2) {
        Complex c = new Complex(0, 0);
        c.real = c1.real + c2.real;
        c.img = c1.img + c2.img;
        return c;
    }

    // function to subtract two complex numbers
    public static Complex sub(Complex c1, Complex c2) {
        Complex c = new Complex(0, 0);
        c.real = c1.real - c2.real;
        c.img = c1.img - c2.img;
        return c;
    }

    // function to multiply two complex numbers
    public static Complex mul(Complex c1, Complex c2) {
        Complex c = new Complex(0, 0);
        c.real = c1.real * c2.real - c1.img * c2.img;
        c.img = c1.real * c2.img + c1.img * c2.real;
        return c;
    }

    // function to print the complex number
    public static void print(Complex c) {
        System.out.println(c.real + " + i" + c.img);
    }
}

class Solution {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);
        Complex c = Complex.add(c1, c2);
        Complex.print(c);
        c = Complex.sub(c1, c2);
        Complex.print(c);
        c = Complex.mul(c1, c2);
        Complex.print(c);
    }
}

