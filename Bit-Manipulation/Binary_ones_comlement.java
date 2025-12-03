import java.util.*;

public class Binary_ones_comlement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        //here finding xor two number using NOT(~) oparator
        System.out.println(~Number);
    }
}
