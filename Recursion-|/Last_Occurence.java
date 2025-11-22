import java.util.*;

public class Last_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter finding element : ");
        int foundingElement = sc.nextInt();

        System.out.print("enter size of array : ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int [sizeOfArray];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        lastOccurence(arr,foundingElement,sizeOfArray);

    }

    public static void lastOccurence(int arr[],int foundingElement, int sizeOfArray){

        if(sizeOfArray == 0){
            System.out.print(foundingElement+" is not founded in array");
            return;
        }

        if(arr[sizeOfArray - 1] == foundingElement){
            System.out.print(foundingElement+"is founded at index "+(sizeOfArray - 1));
            return;
        }

        lastOccurence(arr, foundingElement, sizeOfArray-1);
    }
}
