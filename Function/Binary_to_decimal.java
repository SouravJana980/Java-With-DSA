import java.util.*;

public class Binary_to_decimal {

    public static int binaryToDecimal(int binarynumber){
        int power = 0;
        int reminder = 0;
        int Dn = 0;
        while(binarynumber>0){
            
            reminder = binarynumber%10;
            Dn = reminder*(int)Math.pow(2,power)+Dn;
            binarynumber/=10;
            power++;
        }
        return Dn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary number : ");
        int binarynumber = sc.nextInt();
        System.out.print(binaryToDecimal(binarynumber));
    }
}
