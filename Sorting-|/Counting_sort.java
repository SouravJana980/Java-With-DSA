import java.util.*;

public class Counting_sort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i <= largest; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        countingSort(arr);
    }
}
