import java.util.*;

public class Count_set_bit {

    public static int countSetBit(int Number){
        int count = 0;
        while(Number>0){
            if((Number & 1) != 0){
                count++;
            }
            Number = Number>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println(countSetBit(Number));
    }
}
