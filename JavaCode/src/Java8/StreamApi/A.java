package Java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class A {
    public static void main(String[] args) {
       /* List <Integer>list= Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer>stream =list.stream();
        System.out.println(stream);*/

            //int arr[]={1, 2, 3, 5, 6, 8};
            // IntStream <int> stream1= Arrays.stream(arr);
            Stream<String> str = Stream.of("KETAN", "Vishmay");
            str.forEach(e-> System.out.println(e));
        }
    }
