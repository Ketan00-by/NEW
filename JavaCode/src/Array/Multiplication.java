package Array;

public class Multiplication {
    public static int[][] getMultiplication(int[][] Array1, int[][] Array2){
        int[][] newArray = new int[Array1.length][Array2.length];
        for(int i=0; i<Array1.length; i++){
            for(int j=0; j<Array2.length; j++){
                newArray[i][j] = Array1[i][j] * Array2[j][i];
            }
        }
        return newArray;
    }
}
