import java.util.*;

public class Prifix_max_subarray_sum {

    public static void prefixSum(int arr[]){
        //calculate prefix array

        int prefixArray [] = new int[arr.length];
        prefixArray[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }

        int currentSum = 0;        
        int maxSubArrSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currentSum = start == 0? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                maxSubArrSum = Math.max(maxSubArrSum,currentSum);
            }

        }

        System.out.print("Maximum subarray sum is : "+maxSubArrSum);
        
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