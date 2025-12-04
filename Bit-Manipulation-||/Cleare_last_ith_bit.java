import java.util.*;

public class Cleare_last_ith_bit {

    
        public static int  clearIthBit(int Number,int i){
        int bitMask = 1;

        int result = (Number & ~(1<<i));
        return result;        
        
    }

    public static int  clearLastIBits(int Number,int I){
        int i = 0;
        int result = 0;
        while(i<I){
            
            result = clearIthBit(Number,i);
            Number = result;
            i++;
        }
        return result;
    }
    
    //this is my logic and it is complex
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int Number = sc.nextInt();
        System.out.println("Enter how many times to clear ith bit that is I:");
        int I = sc.nextInt();
        System.out.println(clearLastIBits(Number,I));
    }
}
