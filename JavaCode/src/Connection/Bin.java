public class Bin {
    public static void main(String[] args) {
        Connect1 a = new Connect1();
        System.out.println(a.a1);
        a.m();
    }

    static class Connect1 {
        int a1 = 25;

        void m() {
            System.out.println(a1);
            Connect3 a2 = new Connect3();
            System.out.println(a2.a3);
            a2.m1();
        }
    }

    static class Connect3 {
        int a3 = 40;

        void m1() {
            System.out.println(a3);
            m();
        }

        void m() {
            System.out.println("Hello from Connect3");
        }
    }
}
