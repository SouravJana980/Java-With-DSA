import java.util.*;

public class Merge_sort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void mergeSort(int arr[],int starIndx,int endIndx){
        if(starIndx >= endIndx){
            return;
        }
        int mid = starIndx + ((endIndx-starIndx)>>1);
        mergeSort(arr, starIndx, mid); //left part
        mergeSort(arr, mid+1, endIndx); //right part
        sortAndMerge(arr, starIndx,mid,endIndx);  //call for merge sort
    }

    public static void sortAndMerge(int arr[],int starIndx,int mid,int endIndx){
        int temp[] =new int [endIndx - starIndx + 1];
        int i = starIndx;  //starting for left array
        int j = mid+1;  //starting for right array
        int k = 0;   //loop iteration & k length gose up to temp.length part

        while(i <= mid && j<= endIndx){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for left
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //for right
        while(j<=endIndx){
            temp[k++] = arr[j++];
        }

        //copy temporary array elment to original array
        for(k=0,i=starIndx;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int starIndx = 0;
        int endIndx = size-1;
        int arr[] = new int[size];
        System.out.println("Input array element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,starIndx,endIndx);
        print(arr);
    }
}
