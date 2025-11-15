import java.util.*;

public class Print_user_input_name {
    public static void print_name(String name){
        System.out.print(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name:");
        String name = sc.nextLine();
        print_name(name);
    }
}
