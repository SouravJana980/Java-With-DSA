import java.util.*;

public class Print0toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n:");
        int n = sc.nextInt();
        printInc(n);
    }

    public static void printInc(int n){
        
        if(n == 1){
            System.out.print(1+" ");
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
        
        
    }
}
