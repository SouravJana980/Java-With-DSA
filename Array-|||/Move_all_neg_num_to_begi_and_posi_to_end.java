import java.util.*;

public class Move_all_neg_num_to_begi_and_posi_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]<0 && arr[j]<0){
                i++;
            }else if(0<arr[i] && 0<arr[j]){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
