import java.util.Scanner;

public class Create_mini_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input number1:");
        int number1 = sc.nextInt();
        System.out.print("enter input number2:");
        int number2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        int result;

        switch(operator){
            case '+':
            result = number1+number2;
            System.out.print("result is "+result);
            break;
            case '-':
            result = number1-number2;
            System.out.print("result is "+result);
            break;
            case '*':
            result = number1*number2;
            System.out.print("result is "+result);
            break;
            case '/':
            result = number1/number2;
            System.out.print("result is "+result);
            break;
        }
    }
}
