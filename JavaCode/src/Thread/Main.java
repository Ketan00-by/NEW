package Thread;

public class Main {
    public static void main(String[] args) {
        Create_Thread task1=new Create_Thread();
        Thread t1=new Thread(task1);
        t1.start();
    }
}
