import java.util.*;

public class Count_vowels_in_input_string {

    public static int countVowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string :");
        String str = sc.nextLine();
        System.out.println(countVowels(str));
    }
}
