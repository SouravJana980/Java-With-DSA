public class findPermutation {

    public static void findPermutations(String str, String ans) {

        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Try each character
        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            // removing current char
            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            findPermutations(remaining, ans + current);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}