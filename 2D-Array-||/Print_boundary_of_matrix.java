import java.util.*;

public class Print_boundary_of_matrix {
    public static void printBoundary(int arr[][]){
    int row = arr.length;
    int col = arr[0].length;

    for(int j=0;j<col;j++){
        System.out.print(arr[0][j] + " ");
    }

    for(int i=1;i<row;i++){
        System.out.print(arr[i][col-1] + " ");
    }

    for(int j=col-2;j>=0;j--){
        System.out.print(arr[row-1][j] + " ");
    }

    for(int i=row-2;i>0;i--){
        System.out.print(arr[i][0] + " ");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of row: ");
        int row = sc.nextInt();

        System.out.print("enter number of colunm: ");
        int colunm = sc.nextInt();

        int arr[][] = new int[row][colunm];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colunm; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printBoundary(arr);
    }
}
