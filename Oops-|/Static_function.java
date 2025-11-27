

public class Static_function {
    public static class Student{
        String name;
        int id;
        private static int noOfStudent;

//here getnoOfStudent function is static function

        public static int getnoOfStudent(){
            return noOfStudent;
        }

        public Student(String name,int id){
            this.name = name;
            this.id = id;
            noOfStudent++;
        }

       void display(){
         System.out.print("number of student is:"+noOfStudent+"\n");
       }

    }

    public static void main(String[] args) {
        Student s1 = new Student("sourav",1014);
        s1.display();
        Student s2 = new Student("sourav",14);
        s1.display();

        //here diract call get function without using object because getnoOfStudent() is static function
        System.out.println("no of student is:"+Student.getnoOfStudent());
    }
}
