public class This_keyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("Ram");
        s.setID(1014);
        System.out.println(s.getname());
        System.out.println(s.getID());
    }
}

class Student{
    private String name;
    private int ID;

    public void setname(String name){
        //This refers to the original object name
        this.name = name;
    }

    public void setID(int ID){
        //This refers to the original object ID
        this.ID = ID;
    }

    public String getname(){
        return name;
    }

    public int getID(){
        return ID;
    }
}