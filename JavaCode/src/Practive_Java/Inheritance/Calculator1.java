package Practive_Java.Inheritance;

public class Calculator1 {
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void add(int i,int j,int k){
        System.out.println(i+j+k);
    }
    public static void main(String[] args) {
        Calculator1 c1=new Calculator1();
        c1.add(10,20, 30);
    }
}
