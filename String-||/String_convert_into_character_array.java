public class String_convert_into_character_array {
    public static void main(String[] args) {
        String str = "sourav";
        char ch[] = str.toCharArray();
        //here only print ch all string is print
        System.out.println(ch);
        //here only print only 0th index element
        System.out.print(ch[0]+"\n");
        //here only print ch all string is print but independently each character print
        for(int i=0;i<str.length();i++){
            System.out.println(ch[i]);
        }
        
    }
}
