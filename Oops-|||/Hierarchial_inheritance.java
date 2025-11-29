public class Hierarchial_inheritance {
    public static void main(String[] args) {
        Vertebrates Fish = new Vertebrates();
        Fish.eat();
        Fish.breath();
        Fish.vertebratesFeatures();

        Invertebrates Crustaceans = new Invertebrates();
        Crustaceans.breath();
        Crustaceans.eat();
        Crustaceans.invertebratesFeatures();
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

class Vertebrates extends Animal{
    void vertebratesFeatures(){
        System.out.println("This animal have a spine or backbone.");
    }
}

class Invertebrates extends Animal{
    void invertebratesFeatures(){
        System.out.println("This animal do not have a spine or backbone.");
    }
}