import java.util.*;

public class Sum_of_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        int sum = 0;
        for(int i=0;i<number;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
