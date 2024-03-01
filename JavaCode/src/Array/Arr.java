package Array;

public class Arr {
    public static void main(String[] args) {
        // Example 3D array
        int[][][] myArray = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}},
                {{13, 14, 15}, {16, 17, 18}}
        };

        printArr(myArray);
    }

    public static void printArr(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
