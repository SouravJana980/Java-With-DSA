public class Parameterized_constructor {
    public static void main(String[] args) {
        student s1 = new student("xyz", 0);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class student{
    String name;
    int roll;

    //this is parameterized constructor
    student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    
}
