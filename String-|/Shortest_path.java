import java.util.*;

public class Shortest_path {

    public static float calculateShortestPath(String Diraction){
        float calculateNumber = 0;
        int x = 0;
        int y = 0;
        for(int i=0;i<Diraction.length();i++){
            //north
            if(Diraction.charAt(i) == 'N'){
                y++;
            }
            //soth
            else if(Diraction.charAt(i) == 'S'){
                y--;
            }
            //east
            else if(Diraction.charAt(i) == 'E'){
                x++;
            }
            //west
            else if(Diraction.charAt(i) == 'W'){
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        calculateNumber = (float)Math.sqrt(x2+y2);
        return calculateNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  diraction: ");
        String Diraction = sc.nextLine();
        System.out.println("This diraction ("+Diraction+")'s shortest path is "+calculateShortestPath(Diraction));
    }
}
