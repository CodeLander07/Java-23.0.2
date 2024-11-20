package OOP;

public class inheritance {
    public static void main(strings [] args){
    
    }
}
class animals{
    void eat(){
        System.out.println("eating...");
    }   
    void sleep(){
        System.out.println("sleeping...");
    }
}

class mammels extends animals{
    void Walk(){
        System.out.println("Walks...");
    }
}

class birds extends animals{
    void fly(){
        System.out.println("flies...");
    }
}
class aquatic extends animals{
    void swim(){
        System.out.println("swims...");
    }
}

class human extends mammels{
    void talk(){
        System.out.println("talks...");
    }
}
class fish extends aquatic{
    void breathe(){
        System.out.println("breathes...");
    }
}
class eagle extends birds{
    void hunt(){
        System.out.println("hunts...");
    }
}