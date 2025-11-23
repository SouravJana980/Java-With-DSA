import java.util.*;

public class Find_nCr {

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        return fact(n-1)*n;
        
    }

    public static double nCr(int n, int r){

        int num = fact(n);
        int den = fact(r)*fact(n-r);

        return num/den;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n is:");
        int n = sc.nextInt();

        System.out.print("enter number r is:");
        int r = sc.nextInt();

        System.out.print(nCr(n,r));

        //System.out.print(fact(n));
    }
}
