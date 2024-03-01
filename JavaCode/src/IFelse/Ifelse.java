import org.w3c.dom.ls.LSOutput;
public class Ifelse {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 1;

        if ((a > b) && (a > c)) {
            System.out.println("Max: " + a);
        } else if (b > c) {
            System.out.println("Max: " + b);
        } else {
            System.out.println("Max: " + c);
        }

        if (a < b) {
            System.out.println("Min: " + a);
        } else if (b < c) {
            System.out.println("Min: " + b);
        } else {
            System.out.println("Min: " + c);
        }
    }
}

