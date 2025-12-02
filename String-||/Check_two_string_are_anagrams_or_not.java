import java.util.*;

public class Check_two_string_are_anagrams_or_not {

    public static void checkStringAreAnagrams(String firstStr,String secondStr){

        if(firstStr.equals(secondStr)){
            System.out.println("First string :"+firstStr+": and second string :"+secondStr+": are anagrams");
        }
        
        else if(firstStr.length() == secondStr.length()){
            //here create a string builder
            StringBuilder SSB = new StringBuilder();

            for(int i=0;i<firstStr.length();i++){
                for(int j=0;j<secondStr.length();j++){
                    
                    if(firstStr.charAt(i) == secondStr.charAt(j)){
                        SSB.append(secondStr.charAt(j));
                    }
                }
            }
            //here string builder convert into string 
            String result = SSB.toString();

            //here check new string element are same or not
            if(result.equals(firstStr)){
                System.out.println("First string :"+firstStr+": and second string : "+secondStr+": are anagrams");
            }
            else{
                System.out.println("First string :"+firstStr+": and second string : "+secondStr+": are not anagrams");
            }

            
        }
        else{
            System.out.println("First string :"+firstStr+": and second string : "+secondStr+": are not anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first string :");
        String firstStr = sc.nextLine();
        System.out.println("input second string :");
        String secondStr = sc.nextLine();
        checkStringAreAnagrams(firstStr,secondStr);
    }
}
