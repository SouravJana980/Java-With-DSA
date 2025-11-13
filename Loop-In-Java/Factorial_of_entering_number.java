import java.util.*;

public class Factorial_of_entering_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        System.out.print(fact);
    }
}
