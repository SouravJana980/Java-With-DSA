public class Abstract_class {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        
    }
}

abstract class Animal{
    String color;

    public Animal() {
        color = "brown";
    }
    
    void eat(){
        System.out.println("eat everything.");
    }
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
}