public class Inheritance {
    public static void main(String[] args) {
        dog germanShepherd = new dog();
        germanShepherd.color = "Black";
        System.out.println(germanShepherd.color);
        germanShepherd.eat();
        germanShepherd.catagory();
        germanShepherd.breath();
    }
}

//Base class or parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breath(){
        System.out.println("breathing");
    }
}

//Derive class or subclass
class dog extends Animal{
    void catagory(){
        System.out.println("dog mamels catagory");
    }
}
