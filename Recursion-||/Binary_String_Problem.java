import java.util.*;

public class Binary_String_Problem {

    public static void binaryStingProblem(int n,int lastdigit,String str){

        if(n==0){
            System.out.println(str);
            return;
        }

        binaryStingProblem(n-1,0,str+"0");

        if(lastdigit == 0){
            binaryStingProblem(n-1,1,str+"1");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        binaryStingProblem(n,0,"");
    }
}
