import java.util.*;

public class Check_tows_power_or_not {

    public static void checkTowsPowerOrNot(int Number){
        if((Number & (Number-1)) == 0){
            System.out.println(Number+" is tows power.");
        }
        else{
            System.out.println(Number+" is not tows power.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        checkTowsPowerOrNot(Number);
    }
}
