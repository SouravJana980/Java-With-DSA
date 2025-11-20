import java.util.*;

public class Find_largest_element {

    public static int findLargestElement(int arr[][],int row,int colunm){
        int largestNumber = arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                if(largestNumber<arr[i][i]){
                    largestNumber = arr[i][j];
                }
            }
        }
        return largestNumber;
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
        System.out.print("largest number of this array is : "+findLargestElement(arr, row, colunm));
    }
}
