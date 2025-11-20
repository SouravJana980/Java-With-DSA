import java.util.*;

public class Sum_of_all_odd_and_even_number {
    public static void evenAndOddElement(int arr[][],int row,int colunm){
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                if((arr[i][j])%2 == 0){
                    sumOfEven += arr[i][j];
                }else{
                    sumOfOdd += arr[i][j];
                }
            }
        }
        System.out.print("total sum of even element is : "+sumOfEven+"\n");
        System.out.print("total sum of even element is : "+sumOfOdd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int row = sc.nextInt();
        System.out.print("Enter colunm number : ");
        int colunm = sc.nextInt();
        int arr[][] = new int[row][colunm];
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        evenAndOddElement(arr, row, colunm);
    }
}
