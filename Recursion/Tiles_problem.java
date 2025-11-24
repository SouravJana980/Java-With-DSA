import java.util.*;

public class Tiles_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n:");
        int n = sc.nextInt();
        System.out.print("total way to feelup 2 * n board in "+tilesproblem(n)+" ways.");
    }

    public static int tilesproblem(int n){

        if(n==0 || n==1){
            return 1;
        }

        //vrtical place 
        int fnm1 = tilesproblem(n-1);

        //horizontal place
        int fnm2 = tilesproblem(n-2);

        //totalway
        int totalWays = fnm1+fnm2;


        return totalWays;
    }
}
