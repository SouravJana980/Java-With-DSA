public class Continue_statement {

    //here skip 5 when i value is 5
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}