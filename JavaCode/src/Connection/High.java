public class High {
    public static void main(String[] args) {
        B b1= new B();
        System.out.println(b1.x);
        b1.m1();

        B b2=new B();
        System.out.println(b2.x);


    }
}
class B
{
    int x= 10;
    int a=11;
     void m1(){
        System.out.println(a);

}
}
// b2 same print x,m
//B b3=b1