import java.util.*;

public class Swap_two_number {

    public static void swap(int firstNumber,int secondNumber){
        System.out.print("Before swap a = "+firstNumber+" b = "+secondNumber+" \n");
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;
        System.out.print("Before swap a = "+firstNumber+" b = "+secondNumber+" \n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int firstNumber = sc.nextInt();
        System.out.println("enter second number :");
        int secondNumber = sc.nextInt();
        swap(firstNumber,secondNumber);
    }
}
