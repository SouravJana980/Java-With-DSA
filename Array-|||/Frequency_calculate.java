import java.util.*;

public class Frequency_calculate {

    public static void calculateFrequency(int arr[]){
        int frequencyArray[] = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            frequencyArray[i] = count;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(frequencyArray[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        calculateFrequency(arr);
    }
}
