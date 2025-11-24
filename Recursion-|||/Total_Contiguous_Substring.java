import java.util.*;

public class Total_Contiguous_Substring {

    public static int totalConSubstring(String s,int i,int j,int n){

        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int count = totalConSubstring(s,i+1,j,n-1) + totalConSubstring(s,i,j-1,n-1) - totalConSubstring(s,i+1,j-1,n-2);

        if(s.charAt(i) == s.charAt(j)){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string s :");
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(" string length is: "+n);
        int i=0;
        int j = n-1;
        System.out.print(totalConSubstring(s,i,j,n));
    }
}
