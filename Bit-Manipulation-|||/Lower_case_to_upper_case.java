import java.util.Scanner;

public class Lower_case_to_upper_case {

    public static void lowerCasetouppercase(char ch[]){
        for(int  i = 0;i < ch.length;i++){
            System.out.print((char)(ch[i] & '_') +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        
        lowerCasetouppercase(ch);
    }
}
