import java.util.*;

public class Array_as_function_arguments {

    public static void updateArray(int arr[]){
        System.out.print("update array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print((arr[i] += 4)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //input array
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //print array output
        System.out.print("original array : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        updateArray(arr);
    }
}