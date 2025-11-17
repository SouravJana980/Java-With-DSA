import java.util.Scanner;

public class Buy_and_sell_stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int priceArray[] = new int[size];
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<size;i++){
            priceArray[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int sellingPrice = priceArray[i];
            int profit = priceArray[i] - buyprice;
            if(0<profit){
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyprice = sellingPrice;
            }
        }
        System.out.print("max profit is : "+maxProfit);
    }
}
