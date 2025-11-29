public class Multi_level_Inheritance {
    public static void main(String[] args) {
        Dog germanShepherd = new Dog();
        germanShepherd.color = "broun or white or black:";
        System.out.println(germanShepherd.color);
        germanShepherd.breath();
        germanShepherd.eat();
        germanShepherd.mamelsFeature();
        germanShepherd.dogFeature();
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
    void mamelsFeature(){
        System.out.println("Femal mamels have mammary glands that produce milk to feed their young ones.");
    }
}

class Dog extends Mamels{
    void dogFeature(){
        System.out.println("Dogs are very intelligent & loyal.");
    }
}
