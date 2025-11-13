import java.util.*;

public class print_number_without_multiple_of_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter starting number :");
        int startingnumber = sc.nextInt();
        System.out.print("enter ending number :");
        int endingnumber = sc.nextInt();
        for(int i=startingnumber;i<=endingnumber;i++){
            if(i % 4 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
