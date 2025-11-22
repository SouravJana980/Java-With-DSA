import java.util.*;

public class Find_String_Length {

    public static int stringLength(String str){

        if(str.length() == 0){
            return 0;
        }
        return stringLength(str.substring(1))+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:");
        String str = sc.nextLine();

        System.out.print(stringLength(str));

    }
}
