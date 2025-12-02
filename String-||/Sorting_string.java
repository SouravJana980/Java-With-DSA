import java.util.*;

public class Sorting_string {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input string :");
    String str = sc.nextLine();
    //first convert into character array 
    char ch[] = str.toCharArray();
    //then it sort
    Arrays.sort(ch);
    System.out.print(ch);
    }
}
