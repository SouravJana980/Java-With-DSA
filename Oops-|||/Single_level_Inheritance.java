public class Single_level_Inheritance {
    public static void main(String[] args) {
        Mamels human = new Mamels();
        human.color = "broun or white or black:";
        System.out.println(human.color);
        human.breath();
        human.eat();
        human.feature();
    }
}

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
class Mamels extends Animal{
    void feature(){
        System.out.println("Femal mamels have mammary glands that produce milk to feed their young ones.");
    }
}