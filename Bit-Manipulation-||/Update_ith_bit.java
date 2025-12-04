import java.util.*;

public class Update_ith_bit {

    public static int updateIthBit(int Number,int i,int newBit){
        int num = Number;
        //forst 
        if((Number & (1<<i)) == 0 && (newBit==0||newBit==1)){
            return num | newBit << i;
        }
        else{
            if(newBit == 0){
                return ~(1<<i) & num;
            }
            else{
                return num | newBit << i;
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter how many times to right shift i :");
        int i = sc.nextInt();
        System.out.println("Enter updating bit");
        int newBit = sc.nextInt();
        System.out.println(updateIthBit(Number,i,newBit));
    }
}
