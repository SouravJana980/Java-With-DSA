import java.util.*;

public class Second_largest_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int largest = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargestNum = largest;
                largest = arr[i];
            }
            if(largest>arr[i] && secondLargestNum<arr[i]){
                secondLargestNum = arr[i];
            }
        }
        System.out.print("second largest number in this array is :"+secondLargestNum);
    }
}
