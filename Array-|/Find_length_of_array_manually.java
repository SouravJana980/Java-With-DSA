import java.util.*;

public class Find_length_of_array_manually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //here array length and size is same
        int lengthofarray = 0;
        //input array
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            lengthofarray++;
        }
        System.out.print("entering length of array is : "+lengthofarray);
    }
}
