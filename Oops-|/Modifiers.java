

public class Modifiers {
    public static void main(String[] args) {
        Bank B = new Bank();
        B.bankName = "SBI";
        B.accountHolder = "Sourav Jana";
        B.branchName = "Kolkata Sector V";

        B.setpassword(123456);

        System.out.println(B.accountHolder);
        System.out.println(B.bankName);
        System.out.println(B.branchName);
        //System.out.println(B.setpassword(123456));
    }
}

class Bank{

    //There are 4 access modifiers public,private,protected & default

    public String bankName;
    private int password;
    protected String accountHolder;
    String branchName;

    public void setpassword(int newpassword){
        password = newpassword;
        System.out.println(password);
    }
    
}
