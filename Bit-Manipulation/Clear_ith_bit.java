import java.util.*;

public class Clear_ith_bit {

    public static int  clearIthBit(int Number,int i){
        int bitMask = 1;

        int result = (Number & ~(1<<i));
        return result;        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter how many times to right shift i :");
        int i = sc.nextInt();
        System.out.println(clearIthBit(Number,i));
    }
}