public class Define {
    public static void main(String[] args){
        Define d = new Define();
        Connect1 a= d.new Connect1();
        System.out.println(a.a1);
        a.m();
    }
    class Connect1{
        int a1=25;
        void m()
        {
            System.out.println(a1);
            Connect3 a2= new Connect3();
            System.out.println(a2.a3);
            a2.m1();
        }
    }
    class Connect3
    {
        int a3=40;

        void m1(){
            System.out.println(a3);
        }
    }
}
