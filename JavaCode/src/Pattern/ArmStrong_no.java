package Pattern;
import java.util.*;
public class ArmStrong_no {
        //Armstrong Means Addition of Cubes of Number is Equal to the Num (1³+5³+3³ = 153)
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            Test t1 = new Test();
            t1.ArmStrong(num);
        }
    }


    class Test {
        public void ArmStrong(int num){
            int lastdigit;
            int Sum = 0;
            int Temp = num;
            while (num > 0){
                lastdigit = num % 10;
                num = num / 10;
                Sum = (int) (Sum + Math.pow(lastdigit,3));
            }
            if (Sum == Temp){
                System.out.println("It's a Armstrong Number");
            }
            else {
                System.out.println("It's Not a Armstrong Number");
            }
        }
    }

