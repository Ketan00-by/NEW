package Apna_College.AdvancePattern;

public class InvertedRect {
    public static void Rectr(int n){
        for(int i=1; i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectr(4);
    }
}
