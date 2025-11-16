import java.util.*;

public class Smallest_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.print("smallest number in this array is :"+smallest);
    }
}
