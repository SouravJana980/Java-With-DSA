public class Super_keyword {
    public static void main(String[] args) {
        Programmer Ram = new Programmer();
        Ram.showDetails();
    }
}

class Employee {
    double salary = 30000;

    void work() {
        System.out.println("Employee working");
    }
}

class Programmer extends Employee {
    double salary = 50000;

    void work() {
        System.out.println("Programmer coding");
    }

    void showDetails() {
        System.out.println(super.salary); // Parent salary
        System.out.println(salary);       // Child salary
        super.work();                     // Parent method
        work();                           // Child method
    }
}
