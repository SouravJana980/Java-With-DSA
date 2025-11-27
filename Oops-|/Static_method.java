public class Static_method {
    //static share the same method of a given classes
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "tom";
        s1.id = 121;

        Student s2 = new Student();
        s2.name = "jom";
        s2.id = 123;

        System.out.println(s1.name);
        System.out.println(s1.id);
        s1.schoolName();

        System.out.println(s2.name);
        System.out.println(s2.id);
        s2.schoolName();
    }
}

class Student{
    String name;
    int id;
    public static void schoolName(){
        System.out.println("rhs");
    }
}