import java.util.*;

public class Check_string_palindrom_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string :");
        String inputstring = sc.nextLine();

        boolean flage = true;
        int i=0;
        int j=inputstring.length()-1;
        while(i<=j){
            if(inputstring.charAt(i) != inputstring.charAt(j)){
                flage = false;
                break;
            }
            i++;
            j--;
        }

        if(flage == true){
            System.out.println(inputstring+" is a palindrom string");
        }else{
            System.out.println(inputstring+" is not a palindrom string");
        }

    }
}
