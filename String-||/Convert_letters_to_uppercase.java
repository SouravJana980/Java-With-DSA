import java.util.*;

public class Convert_letters_to_uppercase {

    public static String lettersConvertToUppercase(String str){

        StringBuilder sb = new StringBuilder();
        sb = sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb = sb.append((str.charAt(i)));
                i++;
                sb = sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb = sb.append((str.charAt(i)));
            }
        }
        
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string :");
        String str = sc.nextLine();
        System.out.println(lettersConvertToUppercase(str));
    }
}
