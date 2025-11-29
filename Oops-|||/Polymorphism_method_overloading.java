public class Polymorphism_method_overloading {
    public static void main(String[] args) {
        Calculator multiply = new Calculator();
        System.out.println(multiply.product(3, 5));
        System.out.println(multiply.product(3.2, 5.5));
        System.out.println(multiply.product(3, 5,2));
    }
}

class Calculator{
    int product(int a,int b){
        return a * b;
    }
  
    double product(double a,double b){
        return a * b;
    }

    int product(int a,int b,int c){
        return a * b * c;
    }
  
}