import java.util.*;

public class Table_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input number:");
        int number = sc.nextInt();
        
        for(int i=1;i<=10;i++){
            int table = number*i;
            System.out.print(table+" ");
        }
        
    }
}
