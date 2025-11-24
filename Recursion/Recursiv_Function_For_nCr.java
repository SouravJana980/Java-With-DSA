import java.util.*;

public class Recursiv_Function_For_nCr {

    public static int nCr(int n,int r){

        if(r==0 || n==r){
            return 1;
        }
        return nCr(n-1,r-1) + nCr(n-1,r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n is : ");
        int n = sc.nextInt();

        System.out.print("enter number r is : ");
        int r = sc.nextInt();

        System.out.print(n+" combination "+r+" ( "+n+"C"+r+") is :"+nCr(n,r));
    }
}
