public class Getters_and_setters {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setname("Sourav Jana");
        b.setpassword(1234567);
        System.out.println(b.getname());
        System.out.println(b.getpassword());
    }
}

class Bank{
    private String name;
    private int password;

    public void setname(String newname){
        name = newname;
    }

    public void setpassword(int newpassword){
        password = newpassword;
    }

    public String getname(){
        return name;
    }

    public int getpassword(){
        return password;
    }
}
