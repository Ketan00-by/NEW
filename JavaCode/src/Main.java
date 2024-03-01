import java.util.*;
public class Main {
        static String name = "Ketan";
         static String pass = "Ketan@123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String Username = sc.nextLine();
        System.out.println("Enter Pass");
        String UserPass = sc.nextLine();
        Salary(Username, UserPass);
    }
            public static void Salary(String Username, String UserPass){
            if (name.equals(Username) && pass.equals(UserPass)){
                System.out.println("Pass and username is matched");
            }
            else {
                System.out.println("Pass and username is not matched");
        }
    }
}


//write a java program which create account class which take field salary, username, password of a person. Create a salary
// method which take username and password of person and display salary only if username and password is match.