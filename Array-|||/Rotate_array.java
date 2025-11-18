import java.util.*;

public class Rotate_array {

    public static void swape(int arr[],int start,int end){
        int i = start;
        int j = end;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
    public static void rotateArray(int arr[],int rotate){
        swape(arr,0,arr.length-1);
        swape(arr,0,rotate-1);
        swape(arr,rotate,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        System.out.print("Enter rotate time : ");
        int rotate = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        rotateArray(arr,rotate);
    }
}
