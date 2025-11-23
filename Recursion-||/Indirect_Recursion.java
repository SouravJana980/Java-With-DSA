import java.util.*;

public class Indirect_Recursion {

    public static void A(int n){
        if(n>0){
            System.out.print(n+" ");
            B(n-1);
        }
    }

    public static void B(int n){
        if(n>1){
            System.out.print(n+" ");
            A(n/2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("value of n is :");
        int n = sc.nextInt();
        A(n);
    }
}
