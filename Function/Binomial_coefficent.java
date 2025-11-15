import java.util.*;

public class Binomial_coefficent {
    public static int factorial(int number){
        int result = 1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        return result;
    }

    public static int binomialCoefficent(int n,int r){
        if(n>r){
        int nmr = n-r;
        int result = factorial(n)/(factorial(r)*factorial(nmr));
        return result;
        }else{
            return 0;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n :");
        int n = sc.nextInt();
        System.out.print("enter value of r :");
        int r = sc.nextInt();
        System.out.print(n+"c"+r+" is "+binomialCoefficent(n,r));
    }
}
