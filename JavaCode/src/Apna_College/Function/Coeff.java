package Apna_College.Function;

public class Coeff {
    public static int Factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
        f = f * i;
    }
    return f;
}
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

