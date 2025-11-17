import java.util.*;

//Here also print which position trapped how much water

public class Trapping_rain_water {

    public static int trapped_Rain_Water(int pillerHight[]){
        int totalTrappingRainWater = 0;

        
        //calculate left maximum
        int leftmax[] = new int[pillerHight.length];
        leftmax[0] = pillerHight[0];
        for(int i=1;i<pillerHight.length;i++){
           leftmax[i] = Math.max(pillerHight[i],leftmax[i-1]);
        }

        //calculate right maximum
        int rightmax[] = new int[pillerHight.length];
        rightmax[pillerHight.length-1] = pillerHight[pillerHight.length-1];
        for(int i=pillerHight.length-2;i>=0;i--){
            rightmax[i] = Math.max(pillerHight[i],rightmax[i+1]);
        }

        for(int i=0;i<pillerHight.length;i++){
            int storeWater = Math.min(leftmax[i],rightmax[i]) - pillerHight[i];
            System.out.print(i +"th position store water is : "+storeWater);
            totalTrappingRainWater += storeWater;
            System.out.println();
            
        }
        return totalTrappingRainWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int pillerHight[] = new int[size];
        for(int i=0;i<size;i++){
            pillerHight[i] = sc.nextInt();
        }

        System.out.print("total trapped rain water is : "+ trapped_Rain_Water(pillerHight));

    }
}
