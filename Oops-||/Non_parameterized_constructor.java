public class Non_parameterized_constructor {
    public static void main(String[] args) {
        student s = new student();
    }
}

class student{

    //this is non parameterized constructor
    student(){
        System.out.println("Non parameterized constructor call.");
    }
    
}