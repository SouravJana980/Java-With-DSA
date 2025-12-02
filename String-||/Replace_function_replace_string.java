import java.util.*;

public class Replace_function_replace_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = sc.nextLine();
        System.out.println("Enter string :");
        String str2 = sc.nextLine();
        String str1 = str.replace(str,str2);
        System.out.print(str1);
    }
}
