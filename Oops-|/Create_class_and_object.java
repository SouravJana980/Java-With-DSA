public class Create_class_and_object {
    public static void main(String[] args) {

        //p is an object
        
        Pen p = new Pen();
        p.color = "Black";
        p.tip = 4;
        System.out.println(p.color);
        System.out.println(p.tip);
    }
}

//Create a Pen class
class Pen{
    //There color & tip are property
    String color;
    int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(String newtip){
        color = newtip;
    }

}
