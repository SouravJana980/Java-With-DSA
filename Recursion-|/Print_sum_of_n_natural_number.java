import java.util.*;

public class Print_sum_of_n_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n:");
        int n = sc.nextInt();
        System.out.print("sum of "+n+"natural is:"+sumOfn(n));
    }

    public static int sumOfn(int n){
        if(n == 1){
            return 1;
        }
        int calculateSum = n+sumOfn(n-1);
        return calculateSum;
    }
}
