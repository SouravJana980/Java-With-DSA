import java.util.*;

public class First_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter finding number:");
        int findingNumber = sc.nextInt();

        System.out.print("enter size of array:");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        

        firstOccurence(arr,0,findingNumber);
    }

    public static void firstOccurence(int arr[],int i,int findingNumber){
        if(i == arr.length){
            return;
        }
        if(arr[i] == findingNumber){
            System.out.println("element finding index at: "+i);
            return;
        }

        firstOccurence(arr,i+1,findingNumber);
    }
}
