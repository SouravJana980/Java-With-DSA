import java.util.*;

public class Check_palindrom_or_not {
    public static void isPalindrom(int number){
        int oldnumber = number;
        int newnumber = 0;
        while(0<number){
            int reminder = number%10;
            newnumber = newnumber * 10 + reminder;
            number/=10;
        }
        if(newnumber == oldnumber){
            System.out.print(oldnumber+" is palindrom number.");
        }else{
            System.out.print(oldnumber+" is not palindrom number.");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number num :");
        int num = sc.nextInt();
        isPalindrom(num);
    }
    
}
