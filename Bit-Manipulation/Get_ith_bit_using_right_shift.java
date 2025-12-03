import java.util.*;

public class Get_ith_bit_using_right_shift {
    public static void getIthBit(int number,int i){
        int bitMask = 1;
        if(((number >> i-1) & bitMask) == 0){
            System.out.println("ith bit is" + 0);
        }
        else{
            System.out.println("ith bit is" + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter how many times to right shift i :");
        int i = sc.nextInt();
        getIthBit(Number,i);
    }
}
