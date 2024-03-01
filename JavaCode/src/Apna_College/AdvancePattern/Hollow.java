package Apna_College.AdvancePattern;

public class Hollow {
    public static void Hollow_Rectangle(int Rows, int Colmn) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Colmn; j++) {
                if (i == 1 || i == Rows || j == 1 || j == Colmn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(5, 4);
    }
}

