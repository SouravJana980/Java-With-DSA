import java.util.*;

public class Selection_sort {

    public static void selectionSort(int arr[]){
        for(int j=0;j<arr.length-1;j++){
            int smallest = j;
            for(int i=j+1;i<arr.length;i++){
                
                if(arr[smallest]>arr[i]){
                    smallest = i;
                }
                
            }
            int temp = arr[j];
                arr[j] = arr[smallest];
                arr[smallest] = temp;
        }
        for(int k = 0;k<arr.length;k++){
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
        selectionSort(arr);
    }
}
