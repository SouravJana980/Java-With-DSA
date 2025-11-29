public class Polymorphism_method_overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

//parent class 
class Animal{
    void eat(){
        System.out.println("eat everything");
    }
}

//derive class
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eat grass");
    }
}
