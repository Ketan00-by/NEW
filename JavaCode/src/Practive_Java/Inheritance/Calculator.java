package Practive_Java.Inheritance;
import java.util.*;
public class Calculator {
    public void m1(float f){
        System.out.println("Float");
    }
    public void m1(double d){
        System.out.println("Double");
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.m1(0.082f);
    }
}
