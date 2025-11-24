import java.util.*;

public class Tower_Of_Hanoi {
    public static void TOH(int n,int A,int B,int C){

        if(n>-0){

            TOH(n-1, A, C, B);
            System.out.print("("+A+","+C+"),");
            TOH(n-1, B, A, C);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n number ");
        int n = sc.nextInt();

        System.out.print("enter sourse tower A :");
        int A = 1;

        System.out.print("enter source tower B :");
        int B = 2;

        System.out.print("enter source tower C :");
        int C = 3;

        TOH(n, A, B, C);
    }
}
