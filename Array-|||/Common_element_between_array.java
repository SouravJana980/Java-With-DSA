import java.util.*;

public class Common_element_between_array {

    public static void findCommonelement(int arr[],int brr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == brr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        System.out.print("input arr element : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("input brr element : ");
        int brr[] = new int[size];
        for(int i=0;i<size;i++){
            brr[i] = sc.nextInt();
        }
        findCommonelement(arr,brr);
    }
}
