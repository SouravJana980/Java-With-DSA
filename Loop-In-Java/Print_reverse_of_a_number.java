import java.util.*;

public class Print_reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        int result = 0;
        while(0<number){
            int reminder = number % 10;
            result = result * 10 + reminder;
            number /= 10;
        }
        System.out.println(result);
    }
}
