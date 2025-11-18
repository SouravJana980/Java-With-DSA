import java.util.*;

public class Two_Sum {

    public static void towSum(int num[],int Target){
        int i=0;
        while(i<num.length){
            for(int j=0;j<num.length;j++){
                if(num[i]+num[j] == Target){
                    System.out.print("target element found on indices is : "+i+","+j);
                }
            }

            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of this array : ");
        int size = sc.nextInt();
        System.out.print("Enter target element : ");
        int Target = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        towSum(num,Target);
    }
}
