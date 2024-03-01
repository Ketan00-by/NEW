package Homework.Variable;
//call class
public class Assignment1 {
    int a;
    float b;
    String s;

    public void operation1() {
        a = 10;
        b = 15.26f;
        s = "Java";
    }


    public void operation2() {
        a = 20;
        b = 27f;
        s= "SELENIUM";
    }

    public void display() {
        System.out.println("The Integer Value is :" + a);
        System.out.println("The Float Value is :" + b);
        System.out.println("The String Value is: " + s);
    }
}
class mainAssignment1{
    public static void main(String[] args) {
        Assignment1 d=new Assignment1();
        d.operation1();
        d.display();
        d.operation2();
        d.display();
    }
}