import java.util.*;

public class Odd_number_placed_zero {

    public static void OddNumberPlacedzero(int arr[][],int row,int colunm){
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                if((arr[i][j])%2 !=0){
                    arr[i][j] = 0;
                }
            }
        }
        print(arr,row,colunm);
    }

    public static void print(int arr[][],int row,int colunm){
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
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
        OddNumberPlacedzero(arr, row, colunm);
    }
}
