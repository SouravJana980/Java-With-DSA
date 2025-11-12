import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input number1:");
        int number1 = sc.nextInt();
        System.out.print("enter input number2:");
        int number2 = sc.nextInt();
        int largestNumber = number1>number2?number1:number2;
        System.out.print("largest number is :"+largestNumber);
    }
}
