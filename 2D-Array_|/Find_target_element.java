import java.util.*;

public class Find_target_element {

    public static void findingElement(int arr[][],int row,int colunm,int target){
        for(int i=0;i<row;i++){
            for(int j=0;j<colunm;j++){
                if(arr[i][j] == target){
                    System.out.print("the target element "+target+" is find at index is "+i+","+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ente target element : ");
        int target = sc.nextInt();

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
        findingElement(arr, row, colunm, target);
    }
}
