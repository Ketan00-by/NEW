package Array;
import java.util.*;
public class Sum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int Sum = 0;
        System.out.println("Enter array elements below");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            Sum = Sum + arr[i];
        }
        System.out.println("Sum is : " + Sum);
    }
}

