package Array;

import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        int[] numbers = {12,13,41,15,33,11};
        Arrays.sort(numbers);
        System.out.print("in ascending order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


