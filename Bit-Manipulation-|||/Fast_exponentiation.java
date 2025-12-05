import java.util.*;

public class Fast_exponentiation {
    
    public static int fastExponentiation(int number,int power){
        int ans = 1;
        while(power > 0){
            
            if((power&1) != 0){
                ans = ans * number;
            }
            number *= number;
            power = power >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int number = sc.nextInt();
        System.out.println("enter a power :");
        int power = sc.nextInt();
        
        System.out.println(fastExponentiation(number,power));
    }
}
