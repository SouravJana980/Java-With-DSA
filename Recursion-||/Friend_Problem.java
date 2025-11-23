import java.util.*;

public class Friend_Problem {
    public static int totalWays(int n){

        if(n==1 || n==2){
            return n;
        }   
        //this is lenthy code
        // //choice
        // //single
        // int fnm1 = totalWays(n-1);

        // //creat paire where one find choice another is n-1

        // //paire 
        // int fnm2 = (n-1)*totalWays(n-2);

        // int Totalways = fnm1+fnm2;

        // return Totalways;

        //this is also true and short code
        return totalWays(n-1)+(n-1)*totalWays(n-2);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of friends n :");
        int n = sc.nextInt();
        System.out.print("Total number of friend standing ways are :"+totalWays(n));
    }
}
