package Array;

public class Multi1 {
    public static void main(String[] args) {
        int arr [][]=new int[3][3];
        arr[0][0]=1;
        arr[1][1]=1;
        arr[2][2]=1;
        arr[0][1]=0;
        arr[0][2]=0;
        arr[1][0]=0;
        arr[1][2]=0;
        arr[2][0]=0;
        arr[2][1]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
