import java.util.*;

public class Calculate_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int number = sc.nextInt();
        System.out.print("enter power:");
        int power = sc.nextInt();
        int ans = 0;
        int halfans = 1;
        for(int i=1;i<=power/2;i++){
            halfans *= number;
        }
        if(power%2 != 0){
            ans = halfans*halfans*number;
        }else{
            ans = halfans*halfans;
        }
        System.out.print(number+"^"+power+" is "+ans);
        
    }
}
