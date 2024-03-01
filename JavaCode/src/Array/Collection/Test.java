package Array.Collection;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(3);
        al.add("TKA");
        al.add(null);
        al.add(3);
        al.add('k');
        al.add(3.4);
        System.out.println(al);
        System.out.println(al.size());
        for (int i = 0; i < al.size(); i++) {
          System.out.println(al.get(i));

       // Iterator itr= al.iterator();
        //while (itr.hasNext()){
          //  System.out.println(itr.next());
        }
        }
    }


