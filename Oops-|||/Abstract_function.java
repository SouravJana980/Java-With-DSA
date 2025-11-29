public class Abstract_function {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}

abstract class Animal{
    //abstract function
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse walk on 4 legs.");
    }
}