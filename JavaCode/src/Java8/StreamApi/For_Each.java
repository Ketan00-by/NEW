package Java8.StreamApi;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class For_Each {
    public static void main(String[] args) {
        Consumer<Integer> c = (t) -> {
            System.out.println(t);
        };
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5);
      //  list.stream().forEach(c);
        list.stream().filter(e->e%2==0).distinct().forEach(e-> System.out.println(e));
    }
}
