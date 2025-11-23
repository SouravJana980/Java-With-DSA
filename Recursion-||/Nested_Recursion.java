import java.util.*;

public class Nested_Recursion {

    public static int Fun(int n){

        if(n>100){
            return n-10;
        }else{
            return Fun(Fun(n+11));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("value of n is :");
        int n = sc.nextInt();
        System.out.print(Fun(n));
    }
}
