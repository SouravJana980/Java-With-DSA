public class Add_element_in_string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            //here each ch character add string builder object sb
            sb.append(ch);
        }
        System.out.println(sb);
    }

}
