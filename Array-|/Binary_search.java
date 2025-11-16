import java.util.*;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int findingNumber = 4;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean flage = false;
            int startingIndex = 0;
        int endingIndex = size-1;
        while(startingIndex <= endingIndex){
            
        int mid = (startingIndex+endingIndex)/2;
            if(findingNumber == arr[mid]){
                flage = true;
                break;
            }else if(findingNumber < arr[mid]){
                endingIndex = mid - 1;
            }else{
                startingIndex = mid + 1;
            }
        }
        if(flage == true){
            System.out.print(findingNumber+" is found on this array.");
        }else{
            System.out.print(findingNumber+" is found not on this array.");
        }
        
    }
}
