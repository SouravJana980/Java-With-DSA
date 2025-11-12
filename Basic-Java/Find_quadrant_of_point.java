import java.util.*;    

public class Find_quadrant_of_point{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input x:");
        int x = sc.nextInt();
        System.out.print("enter input y:");
        int y = sc.nextInt();
        if(x>0){
            if(y>0){
                System.out.print(x+" & "+y+" belongs to first quadrant.");
            }else{
                System.out.print(x+" & "+y+" belongs to fourth quadrant.");
            }

        }else{
            if(y>0){
                System.out.print(x+" & "+y+" belongs to second quadrant.");
            }else{
                System.out.print(x+" & "+y+" belongs to third quadrant.");
            }
        }
    }
}
