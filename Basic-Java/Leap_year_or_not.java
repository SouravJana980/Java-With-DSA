import java.util.Scanner;

public class Leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input year:");
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.print(year+" this is leap year.");
        }else if(year % 100 != 0){
            System.out.print(year+" this is not leap year.");
        }else if(year % 100 !=0){
            System.out.print(year+" this is leap year.");
        }
        else if(year<1){
            System.out.print(year+" this is invalid year.");
        }else{
            System.out.print(year+" this is not leap year.");
        }
    }
}
