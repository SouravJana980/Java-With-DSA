import java.util.*;

public class Calculate_input_element_frequency {
    public static int calculateFrequency(int arr[],int number){
        int count = 0;
        for(int i=0;i<arr.length;i++){  
            if(number == arr[i]){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Frequency of "+"is "+calculateFrequency(arr,number));
    }
    
}
