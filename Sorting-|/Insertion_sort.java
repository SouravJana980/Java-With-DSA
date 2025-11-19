import java.util.*;

public class Insertion_sort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int previous = i-1;
            while(previous >= 0 && arr[previous]>current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
}
