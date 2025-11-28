public class Copy_constructor {
    public static void main(String[] args) {
        Car c1 = new Car("BMW",105,9.38);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.milage);

        Car c2 = new Car(c1);
        c2.name = "RR";

        System.out.println(c2.name);
        System.out.println(c2.age);
        System.out.println(c2.milage);
    }
}

class Car{
    String name;
    int age;
    double milage;

    //this is parameterized constructor
    Car(String name,int age,double milage){
        this.name = name;
        this.age = age;
        this.milage = milage;
    }

    //copy constructor
    Car(Car c1){
        this.name = c1.name;
        this.age = c1.age;
        this.milage = c1.milage;
    }
}
