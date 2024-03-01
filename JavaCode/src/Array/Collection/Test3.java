package Array.Collection;

import java.util.*;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        HashSet hst = new HashSet();
        hst.add(10);
        hst.add(3);
        hst.add("TKA");
        hst.add(null);
        hst.add(3);
        hst.add('k');
        hst.add(3.4);
        System.out.println(hst);
        System.out.println(hst.size());
        //for (int i = 0; i < hst.size(); i++) {
        //  System.out.println(hst.get());
        Iterator itr = hst.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


