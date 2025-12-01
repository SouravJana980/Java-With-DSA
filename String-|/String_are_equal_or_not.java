import java.util.*;

public class String_are_equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first String :");
        String firstString = sc.nextLine();

        System.out.print("Input second String :");
        String secondString = sc.nextLine();

       if(firstString.equals(secondString)){
        System.out.println(firstString+" "+secondString+" are equal");
       }else{
        System.out.println(firstString+" "+secondString+" are equal not equal");
       }
        
    }
}
