import java.util.*;

public class Max_subarray_sum_Kadanes_algorithm {

    public static int Kadsnes_algorithm(int arr[]){

        int maxSubArrSum = arr[0];
        int currentSum = arr[0];

        for(int i=0;i<arr.length;i++){
            currentSum = Math.max((currentSum+arr[i]),arr[i]);
            maxSubArrSum = Math.max(maxSubArrSum,currentSum);
        }
        
        return maxSubArrSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("maximum sub array sum is : "+ Kadsnes_algorithm(arr));
        
    }
}
