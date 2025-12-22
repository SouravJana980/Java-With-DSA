public class findSubset {

    public static void findSubsets(String str, int index, String current) {

        // Base case
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        findSubsets(str, index + 1, current + str.charAt(index));

        findSubsets(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}
