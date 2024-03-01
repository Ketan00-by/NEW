package Array;
import java.util.*;
public class IndexOf {
    public static void main(String[] args) {
        int arr[] = {8, 12, 3, 5, 1, 9, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find its index : ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " found at index " + i);
                break;
            } else {
                if (i == arr.length - 1) {
                    System.out.println("Element not present in Array");
                }
            }
        }
    }
}
