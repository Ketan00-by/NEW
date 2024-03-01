package Array;

import java.util.Arrays;

public class Sum1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Use the Arrays.stream() and sum() methods
        int sum = Arrays.stream(numbers).sum();

        System.out.println("Sum of the array elements: " + sum);
    }
}



