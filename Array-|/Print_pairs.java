import java.util.*;

public class Print_pairs {
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
            for(int j=i+1;j<size;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }
}
