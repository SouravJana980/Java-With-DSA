import java.util.*;

public class Prefix_sum {

    public static void prefixSum(int arr[]){
        //calculate prefix array

        int prefixArray [] = new int[arr.length];
        prefixArray[0] = arr[0];
        System.out.print(prefixArray[0]+" ");
        for(int i=1;i<arr.length;i++){
            prefixArray[i] = prefixArray[i-1]+arr[i];
            System.out.print(prefixArray[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        prefixSum(arr);
    }
    
}