import java.util.*;

public class Inbuilt_sort_descending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();

        Integer arr[] = new Integer[size];   

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder()); 

        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
