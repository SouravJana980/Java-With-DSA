import java.util.*;

public class Calculate_income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income :");
        int income = sc.nextInt();
        int tax = 0;
        if(income<500000){
            tax = 0;
        }else if(500000<=income && income<=1000000){
            tax = (int) (income*0.12);
        }else{
            tax = (int) (income*0.30);
        }

        System.out.print("income tax is "+tax);
    }
}
