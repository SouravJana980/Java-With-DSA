import java.util.*;

public class Sum_of_first_n_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.print("sum of n natural number is : "+sum);
    }
}
