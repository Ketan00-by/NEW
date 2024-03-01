package Apna_College;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
      try {
          System.out.println(4);
          System.out.println(5);
          System.out.println(4 / 0);
      }
      catch(Exception a){
          System.out.println(a.getLocalizedMessage());
          System.out.println(0);
          try {
              System.out.println(1 / 0);
          }
          catch (Exception v){
              System.out.println(1);
          }
          finally {
              System.out.println("KEtan");
          }
        }
    }
}
