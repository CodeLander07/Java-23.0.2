package OOP;

public class constructor {
    public static void main (String args[]){
        student s1 = new student();
        student s2 = new student("Rahul", 101);
        student s3 = new student("mayur");
        student s4 = new student(102);
        s3.display();
    }
}

class student{

    String name;
    int rollno;
    // This is non-parameterized constructor
    student(){
        System.out.println("this is Constructor");
    }

    student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    student(String name) {
        this.name = name;
    }

    student(int rollno) {
        this.rollno = rollno;
    }
    void display(){
        System.out.println("Name: " + name + " Rollno: " + rollno);
    }
    
}