import java.util.*;

public class Decimal_to_binary {

    public static int decimalToBinary(int Decimalnumber){
        
        int reminder = 0;
        int Binarynumber = 0;
        while(Decimalnumber>0){
            
            reminder = Decimalnumber%2;
            Binarynumber = Binarynumber*10+reminder;
            Decimalnumber/=2;
            
        }
        return Binarynumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter decial number : ");
        int Decimalnumber = sc.nextInt();
        System.out.print(decimalToBinary(Decimalnumber));
    }
}
