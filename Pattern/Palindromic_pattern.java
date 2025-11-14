import java.util.*;

public class Palindromic_pattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of row:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=i;1<=k;k--){
                System.out.print(k+"");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+"");
            }
            System.out.println();
        }
    }
}
