import java.util.*;

public class Search_number_using_staircase {

    public static boolean stairCase(int arr[][], int key) {

        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true; 
            }
            else if (key < arr[row][col]) {
                col--;  
            }
            else {
                row++;   
            }
        }

        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key number: ");
        int key = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter sorted matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        stairCase(arr, key);
        sc.close();
    }
}
