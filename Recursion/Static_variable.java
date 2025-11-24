import java.util.*;

public class Static_variable {
    public static int x = 0;

    public static int increment(int n){
        if(n>0){
            x++;
            return increment(n-1)+x;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("value of n is :");
        int n = sc.nextInt();
        System.out.print(increment(n));
    }
}
