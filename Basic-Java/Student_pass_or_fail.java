import java.util.Scanner;

public class Student_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        if(number>=33 && number<75){
            System.out.print(number+" is pass number.");
        }else if(number >=75 && number<95){
            System.out.print(number+" is very good number.");
        }else if(number >=95){
            System.out.print(number+" is outstanding number.");
        }
        else{
            System.out.print(number+" is fail number.");
        }
    }
}
