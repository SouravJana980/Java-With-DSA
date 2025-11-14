import java.util.*;

public class Hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of row:");
        int row = sc.nextInt();
        System.out.print("enter number of colunm:");
        int colunm = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=row;k++){
                if(i==1||i==row||k==1||k==colunm){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}