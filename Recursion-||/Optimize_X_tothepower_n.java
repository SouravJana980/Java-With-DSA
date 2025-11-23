import java.util.*;

public class Optimize_X_tothepower_n {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter X number ");
        int X = sc.nextInt();

        System.out.print("enter n number ");
        int n = sc.nextInt();

        System.out.print(X+"^"+n+"is:"+Power(X,n));
    }

    public static int Power(int X,int n){

        if(n == 0){
            return 1;
        }
        int halfpower = Power(X,n/2);
        int halfpowerSquare = halfpower * halfpower;

        if(n%2 != 0){
            halfpowerSquare*=X;
        }

        return halfpowerSquare;
        
    }
}
