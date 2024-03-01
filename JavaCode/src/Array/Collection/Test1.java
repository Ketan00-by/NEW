package Array.Collection;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList ltr = new LinkedList();
        ltr.add(10);
        ltr.add(3);
        ltr.add("TKA");
        ltr.add(null);
        ltr.add(3);
        ltr.add('k');
        ltr.add(3.4);
        System.out.println(ltr);
        System.out.println(ltr.size());
        for (int i = 0; i < ltr.size(); i++) {
            System.out.println(ltr.get(i));

            // Iterator itr= al.iterator();
            //while (itr.hasNext()){
            //  System.out.println(itr.next());
        }
    }
}
