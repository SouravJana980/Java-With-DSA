import java.util.*;

public class Find_odd_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.print(number+" this is even number.");
        }else if(number <1){
            System.out.print(number+" this is invalid number.");
        }else{
            System.out.print(number+" this is odd number.");
        }
    }
}
