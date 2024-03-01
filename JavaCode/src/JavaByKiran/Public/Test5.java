package JavaByKiran.Public;

public class Test5 {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        a1=b1;
        System.out.println(a1.a);
        System.out.println(a1.b);
       // System.out.println(a1.c);
        a1.m1();
        a1.m2();
      //  a1.m3();
    }
}
