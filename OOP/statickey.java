

public class statickey{
    public static void main(String[] args){
        student s1 = new student();
        s1.college = "NIT";
        s1.setName("John");
        System.out.println(s1.getName() + " " + s1.college);
    }
}
class student{
    int rollno;
    String name;
    static String college = "IIT";

    void setName(String name){
        this.name  = name;
    }
    String getName(){
        return this.name;
    }
}
