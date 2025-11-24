import java.util.*;

public class Tree_recursion {

    public static void recursionTree(int n){

        if(n>0){

            System.out.print(n+" ");

            recursionTree(n-1);

            recursionTree(n-1);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n is:");
        int n = sc.nextInt();
        recursionTree(n);
    }
}
