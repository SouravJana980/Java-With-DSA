import java.util.*;

public class Inverted_half_pyramid_with_number {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of row:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
