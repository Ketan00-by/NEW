package Pattern;
class Febonaci_series {
    public void Febonaci_series(int Count) {
        int a = 0, b = 1, Sum = 0;
        System.out.print("Fibonacci Series : " + a + "," + b);
        for (int i = 0; i < Count; i++) {
            Sum = a + b;
            System.out.print("," + Sum);
            a = b;
            b = Sum;
        }
    }
}

class Test_ebonaci_series {
    public static void main(String[] args) {
        final int Count = 10;
        Febonaci_series Test = new Febonaci_series();
        Test.Febonaci_series(Count);
    }
}
