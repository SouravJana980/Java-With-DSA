public class Deep_copy {
    public static void main(String[] args) {
        int marks[] = {99,93,89};
        Student s1 = new Student("sou",marks,123);

        s1.display();
        Student s2 = new Student(s1);
        s2.marks[0] = 100;
        s2.name = "ram";
        s2.display();
        // here not change because shallow copy
        s1.display();
    }
}

class Student{
    String name;
    int marks[];
    int roll;

    //parameterized constructor
    Student(String name,int marks[],int roll){
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    //shallow copy constructor here only refer object
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[s1.marks.length];
        for(int i=0;i<s1.marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    
    void display(){
        System.out.println(name);
        System.out.println(roll);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

}
