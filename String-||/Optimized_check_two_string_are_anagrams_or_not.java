import java.util.*;

public class Optimized_check_two_string_are_anagrams_or_not {

    //Here check String are anagrams or not
    public static boolean stringAreAnagrams(String firstStr,String secondStr){

        //Here first string convert into character array
        char fs []= firstStr.toCharArray();
        //Here sort character array
        Arrays.sort(fs);

        //Here first string convert into character array
        char ss [] = secondStr.toCharArray();
        //Here sort character array
        Arrays.sort(ss);

        //Here check String are anagrams or not
        if(Arrays.equals(fs,ss)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("input first string :");
        String firstStr = sc.nextLine();
        System.out.println("input second string :");
        String secondStr = sc.nextLine();

        if(stringAreAnagrams(firstStr,secondStr)){
            System.out.println("First string :"+firstStr+": and second string :"+secondStr+": are anagrams");
        }
        else{
            System.out.println("First string :"+firstStr+": and second string : "+secondStr+": are not anagrams");
        }
    }
}
