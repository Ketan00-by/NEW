package Practive_Java.Inheritance;

public class Student {
    String name;
    int age;
    Address address;
    void display(){
        System.out.println(name+" "+age);
        System.out.println(address.city+" "+ address.street1+" "+address.pinCode);
    }
}
