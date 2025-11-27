public class Encaptulation {
    public static void main(String[] args) {
        Coustomer c = new Coustomer();
        c.name = "sourav";
        System.out.print("coustomer name is:"+c.name+"\n");
        c.ACno = 1209;
        System.out.print(" acount number:"+c.ACno+"\n");
        c.setpassword(042315);
        System.out.print(" and password is:"+c.getpassword());
    }
}
//Encaptulation is binding of code for data hiding
class Coustomer{
    String name;
    int ACno;
    private int password;

    public void setpassword(int password){
        this.password = password;
    }

    int getpassword(){
        return password;
    }
}
