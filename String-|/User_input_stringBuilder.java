import java.util.*;

public class User_input_stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //here create a string builder type object sb
        StringBuilder sb = new StringBuilder();
        System.out.print("Input string :");
        String inputString = sc.nextLine();
        //here user input string add with string builder object sb
        sb.append(inputString);
        System.out.print(sb);
    }
}
