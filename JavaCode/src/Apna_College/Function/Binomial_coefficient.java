package Apna_College.Function;

public class Binomial_coefficient extends Factoriaal {
    public static int BIN_COFF(int n,int r){
        int fact_n=Factorial(n);
        int fact_r=Factorial(r);
        int NmR=(n-r);
        int BIN_COFF=(fact_n)/(fact_r*NmR);
        return BIN_COFF;
    }

    public static void main(String[] args) {
        System.out.println(BIN_COFF(5,2));
    }
}
