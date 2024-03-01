package Pattern;
import java.util.*;

    public class Pelindrome_no {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("int number");
            int no = sc.nextInt();
            if (isPalindrome(no)) {
                System.out.println("is a palindrom");
            } else {
                System.out.println("not a palindrome");
            }
        }
            public static boolean isPalindrome(int number){
                int no=0;
                int original=number;
                int rev=0;
                while(number>0){
                    int lastDigit=number%10;
                  rev=(rev*10)+lastDigit;
                  number/=10;
                }
                return original==rev;
            }
        }

