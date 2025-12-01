import java.util.*;

public class Print_each_character_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string :");
        String inputstring = sc.nextLine();

        for(int i=0;i<inputstring.length();i++){
            System.out.print(inputstring.charAt(i)+" ");
        }

    }
}
