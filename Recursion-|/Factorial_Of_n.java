import java.util.*;

public class Factorial_Of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter factorial number n:");
        int n = sc.nextInt();
        factorial(n);
    }

    public static int multiply = 1;

    public static void factorial(int n){
        
        if(n==1){
            System.out.print("n factorial is :"+multiply);
            return;
        }
        multiply = multiply * n;
        
        factorial(n-1);
    }
    
}
