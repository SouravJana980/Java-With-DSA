import java.util.*;

public class Array_is_sorted_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        isSorted(arr,0);
    }

    public static void isSorted(int arr[],int i){
        if(i == arr.length-1){
            System.out.println("this array is sorted:");
            return;
        }

        if(arr[i]>arr[i+1]){
            System.out.println("this array is unsorted:");
            return;
        }

        isSorted(arr,i+1);
    }
    
}
