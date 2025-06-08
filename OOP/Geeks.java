package OOP;
import java.io.*;

class Geeks {
    
    // data members of the class
    
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor
        GFG geek1 = new GFG ("Sweta", 68);
        GFG geek2 = new GFG ("Rahul", 101);
        
    }
}

class GFG 
    {
    String name;
    int id;
  
    GFG (String name, int id) {
        this.name = name;
        this.id = id;
      System.out.println("GeekName: " + name
                           + " and GeekId: " + id);
    }
}