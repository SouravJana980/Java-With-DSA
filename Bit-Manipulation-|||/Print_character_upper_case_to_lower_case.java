import java.util.*;

public class Print_character_upper_case_to_lower_case {

    public static void uppercasetolowerCase(char ch[]){
        for(int  i = 0;i < ch.length;i++){
            System.out.print((char)(ch[i] | ' ') +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = sc.nextLine();
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
        }
        uppercasetolowerCase(ch);
    }
}
