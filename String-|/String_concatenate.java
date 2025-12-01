import java.util.*;

public class String_concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first name :");
        String firstName = sc.nextLine();

        System.out.print("Input last name :");
        String lastName = sc.nextLine();

        //add two string that calls sting concatenate
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        
    }
}
