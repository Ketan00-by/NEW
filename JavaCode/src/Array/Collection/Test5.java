package Array.Collection;
import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        TreeSet tst = new TreeSet();
        tst.add(10);
        tst.add(3);
        tst.add("TKA");
        tst.add(null);
        tst.add(3);
        tst.add('k');
        tst.add(3.4);
        System.out.println(tst);
        System.out.println(tst.size());
        //for (int i = 0; i < tst.size(); i++) {
        //System.out.println(tst.get());
       Iterator itr = tst.iterator();
       while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

