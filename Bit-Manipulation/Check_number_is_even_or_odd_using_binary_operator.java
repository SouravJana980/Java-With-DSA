import java.util.*;

public class Check_number_is_even_or_odd_using_binary_operator {

    public static void evenOrOdd(int number){
        int bitMask = 1;
        if((number & bitMask) == 0){
            System.out.print(number+" is even number.");
        }
        else{
            System.out.print(number+" is odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int Number = sc.nextInt();
        evenOrOdd(Number);
    }
}
