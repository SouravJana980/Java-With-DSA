import java.util.*;

public class Nth_Fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int number = sc.nextInt();
        System.out.print(number+"th fiboncci number is:"+fibonacci(number));
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int nThFibonacci = fibonacci(n-1) + fibonacci(n-2);
        return nThFibonacci;
    }
}
