import java.util.*;

public class Break_when_number_multiple_of_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("entering number:");
            int number = sc.nextInt();
            if(number%10 == 0){
                break;
            }
            System.out.print(number+"\n");
        }
    }
}