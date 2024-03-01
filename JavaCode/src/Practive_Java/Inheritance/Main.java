package Practive_Java.Inheritance;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ketan";
        s1.age = 26;
        Address a1=new Address();
        a1.city="NAgpur";
        a1.street1="Trimurti nagar";
        a1.pinCode="440011";
        s1.address=a1;
        s1.display();
    }
}
