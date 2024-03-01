import java.sql.SQLOutput;

public class High1 {
    public static void main(String[] args) {
        C c1= new C();
        System.out.println(c1.x1);
        c1.m2();
        C c2=new C();
        System.out.println(c2.x1);
        c2.m2();

        C c3= c1;
        System.out.println(c3.x1);
        c3.m2();
    }
}
class C
{
    int x1=25;
    int x2= 10;
    public void m2(){
        System.out.println(x2);
    }
}
