import java.util.Scanner;

public class Quick_sort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //find pivot index
        int pivotIndex = pertition(arr,si,ei);
        //for left part
        quickSort(arr,si,pivotIndex-1);
        //for right part
        quickSort(arr,pivotIndex+1,ei);

    }

    public static int  pertition(int arr[],int si,int ei){
        int pivot = arr[ei];        
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Input array element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
