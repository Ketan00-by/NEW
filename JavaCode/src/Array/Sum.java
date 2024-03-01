package Array;

public class Sum {
    public static void main(String[] args) {
        int g[] = {1, 2, 3, 4, 5};
        int sum = sumArray(g);
        System.out.println("Sum of the array elements: " + sum);
    }

    // Method to calculate the sum of an array
    public static int sumArray(int[] arr) {
        int sum = 0;

        // Iterate through the array and accumulate the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}

