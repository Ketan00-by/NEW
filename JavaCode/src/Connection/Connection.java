public class Connection {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.x);
        b1.m1();
    }

    static class B {
        int x = 10;

        void m1()
        {
            System.out.println(x);
            C b2=new C();
            System.out.println(b2.x1);
            b2.m2();
        }
        class C {
            int x1=20;
            void m2(){
                System.out.println(x1);
            }
        }
    }
}