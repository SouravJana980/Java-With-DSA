import java.util.*;

public class String_compression {

    public static void stringCompress(String str){

        for(int i = 0; i < str.length(); ){
            char ch = str.charAt(i);
            int count = 1;
            i++;

            while(i < str.length() && str.charAt(i) == ch){
                count++;
                i++;
            }

            System.out.print(ch);
            if(count > 1){
                System.out.print(count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string :");
        String str = sc.nextLine();
        stringCompress(str);
    }
}
