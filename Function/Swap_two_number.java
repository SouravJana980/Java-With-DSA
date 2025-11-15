import java.util.*;

public class Swap_two_number {

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print("swap value of a is :"+a+"\nswap value of b is :"+b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a :");
        int a = sc.nextInt();
        System.out.print("enter number b :");
        int b = sc.nextInt();
        swap(a,b);

    }
}
