import java.util.*;

public class String_object_are_equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first String :");
        String firstString = sc.nextLine();

        System.out.print("Input second String :");
        String secondString = sc.nextLine();

        //here all time print false because object firstString and secondString memory location are not same. 
       if(firstString == secondString){
        System.out.println(firstString+" "+secondString+" are equal");
       }else{
        System.out.println(firstString+" "+secondString+" are equal not equal");
       }
        
    }
}
