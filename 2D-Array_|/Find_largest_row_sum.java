import java.util.*;

public class Find_largest_row_sum {

    public static int largestSumOfRowNumber(int arr[][],int row,int colunm){
        int largestRowSum = 0;
        
        for(int i=0;i<row;i++){
            int rowSum = 0;
            for(int j=0;j<colunm;j++){
                
                rowSum += arr[i][j];
                
            }
            if(largestRowSum<rowSum){
                largestRowSum = rowSum;
            }
        }
        return largestRowSum;
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
        System.out.print("largest sum is : "+largestSumOfRowNumber(arr, row, colunm));
    }
}
