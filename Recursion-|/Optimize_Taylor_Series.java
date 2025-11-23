import java.util.*;

public class Optimize_Taylor_Series {

    static double s = 1;

    public static double e(int X,int n){

        if(n==0){
            return s;
        }
        s = 1 + s * X/n;
        return e(X,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter X is:");
        int X = sc.nextInt();

        System.out.print("enter n is:");
        int n = sc.nextInt();

        System.out.print(e(X,n)); 
    }
}
