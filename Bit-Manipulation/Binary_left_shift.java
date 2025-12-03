import java.util.*;

public class Binary_left_shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter how many times to left shift i :");
        int i = sc.nextInt();
        //Here binary number right shift using << operator
        System.out.println(Number << i);
    }
}
