import java.util.*;

public class Spiral_matrix {

    public static void spiralMatrix(int arr[][], int row, int colunm) {

        int startRow = 0;
        int startcolunm = 0;
        int endRow = row - 1;
        int endcolunm = colunm - 1;

        while (startRow <= endRow && startcolunm <= endcolunm) {

            for (int j = startcolunm; j <= endcolunm; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endcolunm] + " ");
            }

            if (startRow < endRow) {
                for (int j = endcolunm - 1; j >= startcolunm; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
            }

            if (startcolunm < endcolunm) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(arr[i][startcolunm] + " ");
                }
            }

            startRow++;
            endRow--;
            startcolunm++;
            endcolunm--;
        }

        System.out.println();
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

        spiralMatrix(arr, row, colunm);
    }
}
