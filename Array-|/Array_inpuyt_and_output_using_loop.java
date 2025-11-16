import java.util.*;

public class Array_inpuyt_and_output_using_loop {
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
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
