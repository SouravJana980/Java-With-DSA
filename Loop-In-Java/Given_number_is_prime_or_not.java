import java.util.*;

public class Given_number_is_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        if(number == 2 || number == 3){
            System.out.print(number+"is a prime number.");
            return;
        }
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                flag = false;
            }else{
                flag = true;   
            }
        }
        if(flag == true){
            System.out.print(number+"is a prime number.");
        }else{
            System.out.print(number+"is not a prime number.");
        }
    }
}
