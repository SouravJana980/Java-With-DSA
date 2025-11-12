import java.util.Scanner;

public class multiply_of_two_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input element1:");
        int element1 = sc.nextInt();
        System.out.print("enter input element2:");
        int element2 = sc.nextInt();
        int multiply = element1*element2;
        System.out.print(element1+" * "+element2+" is : "+multiply);   
    }

}
