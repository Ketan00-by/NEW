
public class Connect {
    public static void main(String[] args){
        Connect1 c= new Connect1();
      System.out.println(c.a1);
        c.m();
    }
    static class Connect1{
        int a1=25;
        void m()
        {
            System.out.println(a1);
            Connect3 c2 = new Connect3();
            System.out.println(c2.a3);
            c2.m1();
        }
        void m3()
        {

            Connect3 c2 = new Connect3();
            System.out.println(a1);

        }
    }
    static class Connect3
    {
        int a3=40;
        Connect1 c4=new Connect1();
        void m1(){
            System.out.println(a3);
            c4.m3();

        }
    }
    }
