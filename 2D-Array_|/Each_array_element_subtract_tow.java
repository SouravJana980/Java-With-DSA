import java.util.*;

public class Each_array_element_subtract_tow {

    public static void subtractTwo(int arr[][],int row,int colunm){
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                arr[i][j] -= 2;
            }
        }

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
        subtractTwo(arr, row, colunm);
    }
}
