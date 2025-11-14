import java.util.*;

public class Solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of row:");
        int row = sc.nextInt();
        System.out.print("enter number of colunm:");
        int colunm = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=colunm;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
