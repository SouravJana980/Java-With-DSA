import java.util.*;

public class Butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of row:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(row-i)*2;k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=i*2-2;k++){
                System.out.print("   ");
            }
            for(int l=1;l<=row-i+1;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
