import java.util.*;

public class Product_of_two_number {
    
    public static int product(int firstnumber,int secondnumber){
        int result = firstnumber * secondnumber;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int firstnumber = sc.nextInt();
        System.out.print("enter second number:");
        int secondnumber = sc.nextInt();
        System.out.print(firstnumber+" * "+secondnumber+" is "+product(firstnumber,secondnumber));
    }
}
