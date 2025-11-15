import java.util.*;

public class Print_fibonacci_series {
    public static void fibonacciSeries(int number){
        int firstnumber = 0;
            int secondnumber = 1;
            int next = 0;
            if(number == 0){
                System.out.print(number);
            }else{
                System.out.print(firstnumber+" "+secondnumber+" ");
        for(int i=2;i<=number;i++){
            next = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = next;
            System.out.print(next+" ");
        }    
            }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number num :");
        int num = sc.nextInt();
        fibonacciSeries(num);
    }
}
