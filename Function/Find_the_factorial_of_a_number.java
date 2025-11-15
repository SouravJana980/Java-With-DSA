import java.util.*;

public class Find_the_factorial_of_a_number {

    public static int factorial(int number){
        int result = 1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number num :");
        int num = sc.nextInt();
        System.out.print("factorial of "+num+" is:"+factorial(num));
    }
}
