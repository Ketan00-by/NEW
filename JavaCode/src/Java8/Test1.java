package Java8;

public class Test1 {
    public static void main(String[] args) {
        Runnable r= new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t1= new Thread(r);
        t1.start();
    }
}
/*Runnable r= new Runnable() {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
};
Thread t1= new Thread(r);
        t1.start();
    }
            }*/