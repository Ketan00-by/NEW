package Array.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 {
    public static void main(String[] args) {
        LinkedHashSet LST = new LinkedHashSet();
        LST.add(10);
        LST.add(3);
        LST.add("TKA");
        LST.add(null);
        LST.add(3);
        LST.add('k');
        LST.add(3.4);
        System.out.println(LST);
        System.out.println(LST.size());
        //for (int i = 0; i < LST.size(); i++) {
           // System.out.println(LST.get());
        Iterator itr = LST.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
