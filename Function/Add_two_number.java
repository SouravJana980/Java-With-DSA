import java.util.*;

public class Add_two_number {

    public static int sum(int firstnumber,int secondnumber){
        int add = firstnumber + secondnumber;
        return add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int firstnumber = sc.nextInt();
        System.out.print("enter second number:");
        int secondnumber = sc.nextInt();
        System.out.print(firstnumber+" + "+secondnumber+" is "+sum(firstnumber,secondnumber));
    }
}
