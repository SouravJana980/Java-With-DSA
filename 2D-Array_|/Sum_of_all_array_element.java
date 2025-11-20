import java.util.*;

public class Sum_of_all_array_element {

    public static int sumOfAllElement(int arr[][],int row,int colunm){
        int totalSum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                totalSum += arr[i][j];
            }
        }
        return totalSum;
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
        System.out.print("Total array element sum is : "+sumOfAllElement(arr, row, colunm));
    }
}
