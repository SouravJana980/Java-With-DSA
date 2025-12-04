import java.util.*;

public class Clear_last_i_times_bit_simple_way {

    public static int clearLastIBits(int Number,int I){

        return (~(0)<<I)&Number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter how many times to clear ith bit that is I:");
        int I = sc.nextInt();
        System.out.println(clearLastIBits(Number,I));
    }
}
