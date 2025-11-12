import java.util.*;

public class Compair_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input number1:");
        int number1 = sc.nextInt();
        System.out.print("enter input number2:");
        int number2 = sc.nextInt();
        if(number1>number2){
            System.out.print(number1+" is bigger");
        }else{
            System.out.print(number2+" is bigger");
        }
    }
}
