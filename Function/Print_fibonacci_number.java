import java.util.*;

public class Print_fibonacci_number {

    public static int fibonacciSeries(int number){
        if(number == 0||number == 1){
            return number;
        }else{
            int firstnumber = 0;
            int secondnumber = 1;
            int next = 0;
        for(int i=2;i<=number;i++){
            next = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = next;
        }
        return next;
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number num :");
        int num = sc.nextInt();
        System.out.print(fibonacciSeries(num));
    }
}
