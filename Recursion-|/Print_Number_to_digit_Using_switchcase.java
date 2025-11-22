import java.util.*;

public class Print_Number_to_digit_Using_switchcase {

    public static void digitToCharacter(int digit){
        if(digit == 0){
            return;
        }

        digitToCharacter(digit/10);
        
        switch(digit % 10){
            case 0:
            System.out.print("zero ");
            break;

            case 1:
            System.out.print("one ");
            break;
            case 2:
            System.out.print("two ");
            break;
            case 3:
            System.out.print("three ");
            break;
            case 4:
            System.out.print("four ");
            break;

            case 5:
            System.out.print("five ");
            break;
            case 6:
            System.out.print("six ");
            break;
            case 7:
            System.out.print("seven ");
            break;
            case 8:
            System.out.print("eight ");
            break;
            case 9:
            System.out.print("nine ");
            break;
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter digit:");
        int digit = sc.nextInt();
        digitToCharacter(digit);
    }
}
