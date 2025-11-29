

public class Hybrid_inheritance {
    public static void main(String[] args) {
        Dog germanShepherd = new Dog();
        germanShepherd.breath();
        germanShepherd.eat();
        germanShepherd.mamelsFeature();
        germanShepherd.dogFeature();

        Human american = new Human();
        american.breath();
        american.eat();
        american.mamelsFeature();
        american.humanFeatures();

        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.fishFeatures();

        Bird peacock = new Bird();
        peacock.breath();
        peacock.eat();
        peacock.birdFeatures();

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
        System.out.println("Dogs are loyal.");
    }
}

class Human extends Mamels{
    void humanFeatures(){
         System.out.println("mostely human are not loyal like dog.");
    }
}

class Fish extends Animal{
    void fishFeatures(){
        System.out.println("They can swiming.");
    }
}

class Bird extends Animal{
    void birdFeatures(){
        System.out.println("They can fly.");
    }
}