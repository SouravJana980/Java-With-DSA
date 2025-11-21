import java.util.*;

public class Swaping_row_and_colunm {

    public static void swapRowAndColunm(int arr[][],int row,int colunm){

    System.out.println("print original 2D array :");
    for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("print row and colunm swap 2D array :");
        for(int j=0;j<colunm;j++){

            for(int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of row: ");
        int row = sc.nextInt();
        System.out.print("enter number of colunm: ");
        int colunm = sc.nextInt();
        int arr[][] = new int [row][colunm];
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        swapRowAndColunm(arr, row, colunm);
    }
}
