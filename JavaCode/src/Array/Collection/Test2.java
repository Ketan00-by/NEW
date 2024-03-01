package Array.Collection;

import java.util.Vector;

public class Test2 {
    public static void main(String[] args) {
        Vector vcr = new Vector();
        vcr.add(10);
        vcr.add(3);
        vcr.add("TKA");
        vcr.add(null);
        vcr.add(3);
        vcr.add('k');
        vcr.add(3.4);
        System.out.println(vcr);
        System.out.println(vcr.size());
        for (int i = 0; i < vcr.size(); i++) {
            System.out.println(vcr.get(i));
        }
    }
}
