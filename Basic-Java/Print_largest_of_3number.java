import java.util.*;

public class Print_largest_of_3number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input number1:");
        int number1 = sc.nextInt();
        System.out.print("enter input number2:");
        int number2 = sc.nextInt();
        System.out.print("enter input number3:");
        int number3 = sc.nextInt();
        if(number1>number2 && number1>number3){
            System.out.print(number1+" is bigger");
        }else if(number2>number1 && number2>number3){
            System.out.print(number2+" is bigger");
        }else if(number3>number1 && number3>number2){
            System.out.print(number3+" is bigger");
            
            //when all number are same
        }else{
            System.out.print("all are same number.");
        }
    }
}
