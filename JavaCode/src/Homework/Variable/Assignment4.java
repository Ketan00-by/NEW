package Homework.Variable;
//boolean
public class Assignment4 {
    boolean a=true;
    void d(){
        if(a==true){
            a=false;
        }
    }

    public static void main(String[] args) {
        Assignment4 b=new Assignment4();
        b.d();
        System.out.println(b.a);
    }
}
