package Pattern;

import java.util.Scanner;

public class Reverse_word {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Write a statement : ");
            String statement = sc.nextLine();

            Test1 t1 = new Test1();
            t1.Reverse(statement);
        }
    }
    class Test1 {
        public void Reverse(String statement) {
            String[] s = statement.split(" ");
            for (int i = s.length - 1; i >= 0; i--) {
                System.out.print(" "+s[i]);
            }
        }
    }

