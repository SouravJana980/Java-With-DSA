import java.util.*;

public class Adult_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter input age:");
        int age = sc.nextInt();
        if(18<= age){
            System.out.print(age+" this is adult.");
        }else if(age <1){
            System.out.print(age+" this is invalid age.");
        }else{
            System.out.print(age+" this is not adult.");
        }
    }
}
