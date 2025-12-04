import java.util.*;

public class Clear_range_of_bits {

    public static int learRangeOfBits(int Number,int i,int j){
        int a = (~(0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return bitMask & Number;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter clearing starting bit i:");
        int i = sc.nextInt();
        System.out.println("Enter clearing ending bit j:");
        int j = sc.nextInt();
        System.out.println(learRangeOfBits(Number,i,j));
    }
}
