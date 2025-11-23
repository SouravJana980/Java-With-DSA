import java.util.*;

public class Optimize_Fibonacci_Series {

    static int f[] = new int[10];

    public static int fibonacciSeriesL(int n){

        if(n<=1){
            f[n] = n;
            return n;
        }
        
        if(f[n-2] == -1){
        f[n-2] = fibonacciSeriesL(n-2);
        }

        if(f[n-1] == -1){
        f[n-1] = fibonacciSeriesL(n-1);
        }

        f[n] = f[n-2] + f[n-1];

        return f[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n is:");
        int n = sc.nextInt();
        for(int i = 0;i<10;i++){
            f[i] = -1;
        }
        System.out.print(fibonacciSeriesL(n));
    }
}
