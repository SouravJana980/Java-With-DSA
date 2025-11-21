import java.util.*;

public class Print_each_colunm_sum {

    public static void sumOfEachColunm(int arr[][],int row,int colunm){
        for(int j=0;j<colunm;j++){
            int eachColunmSum = 0;
            for(int i=0;i<row;i++){
                eachColunmSum += arr[i][j];
            }
            System.out.print(j+"th colunm sum is :"+eachColunmSum+"\n");
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
        sumOfEachColunm(arr, row, colunm);
    }
}
