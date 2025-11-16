import java.util.*;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int findingNumber = 4;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean flage = true;
        for(int i=0;i<size;i++){
            if(arr[i] == findingNumber){
                flage = true;
                break;
            }else{
                flage = false;
            }
        }
        if(flage == true){
            System.out.print(findingNumber+" is found on this array.");
        }else{
            System.out.print(findingNumber+" is found not on this array.");
        }
    }
}
