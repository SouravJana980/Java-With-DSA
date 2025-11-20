import java.util.*;

public class Smallest_number_in_array {
    public static int findSmallestValue(int arr[][],int row,int colunm){
        int smallestValue = arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                if(smallestValue>arr[i][j]){
                    smallestValue = arr[i][j];
                }
            }
        }
        return smallestValue;
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
        System.out.print("smallest value of this array is : "+findSmallestValue(arr, row, colunm));
    }
}
