import java.util.*;

public class Maximum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int maxSubArrSum = Integer.MIN_VALUE;
        for(int i = 0;i<size;i++){
            int start = i;
            for(int j=i;j<size;j++){
                int end = j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
                if(maxSubArrSum<sum){
                    maxSubArrSum = sum;
                }
            }
        }
        System.out.print("Maximum subarray sum is : "+maxSubArrSum);
    }

}
