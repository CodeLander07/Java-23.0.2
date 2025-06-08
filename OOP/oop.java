package OOP;
public class oop {
    public static void main(String args[]){
        pen p = new pen();
        p.colour("blue");
        p.length(5);
        System.out.println("Colour: " + p.colour + " Length: " + p.length);
    }
}
 class pen {
    String colour;
    int length;
    void colour(String c) {
        colour = c;
    }
    void length(int l) {
        length = l;
    }

 }