import java.util.*;

public class Print_subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("all possible paire is : ");
        for(int i=0;i<size;i++){
           int start = i; 
            for(int p=i+1-1;p<size;p++){
                int end = p;
            System.out.print("{");
            for(int j=start;j<=end;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.print("},\n");
        }
        }
    }
}
