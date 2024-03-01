package Apna_College.Variable;
import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pencil= sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=pencil+pen+eraser;
        float total=bill+(bill*0.18f);
        System.out.println("total with gst 18%:"+total);
    }
}
