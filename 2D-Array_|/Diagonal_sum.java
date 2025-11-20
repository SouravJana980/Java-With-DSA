import java.util.*;

public class Diagonal_sum {

    public static int diagonalSum(int arr[][],int row,int colunm){
        int totalDiagonalSum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                if(i == j){
                    totalDiagonalSum += arr[i][j];
                }
            }
        }
        return totalDiagonalSum;
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
        System.out.print("Total diagonal sum is : "+diagonalSum(arr, row, colunm));
    }
}
