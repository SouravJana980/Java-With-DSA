import java.util.*;

public class Add_one_using_bit_manipulation {

    public static void addOneUsingBitManipulation(int number){
        //first 1's complement of number
        int onsComplement = ~number;
        //then 2's complement of number
        int towsComplement = ~onsComplement +1;
        System.out.println(towsComplement);
        //1's complement of number
        //~number
        //2's complement of 1's complement number directly that is (-(~number))
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int number = sc.nextInt();
        addOneUsingBitManipulation(number);
    }
}
