import java.util.*;

public class Backtracking_on_array {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void arrayBacktracking(int arr[],int indx,int value){
        //Base case
        if(indx == arr.length){
            //This array is hitting before base case
            print(arr);
            System.out.println();
            return;
        }
        //Recursion
        arr[indx] = value;
        arrayBacktracking(arr, indx+1,value+1);//final step
        arr[indx] = arr[indx] - 2;//backtracking step
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = 0;
        }
        arrayBacktracking(arr,0,1);
        //This is final array
        print(arr);
    }
}
