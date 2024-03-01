package Java8;

public class AnonymousInner {
    interface Greeting {
        void greet();
    }

    public static void main(String[] args) {
        // Creating an instance of the Greeting interface using an anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        // Invoking the greet() method of the anonymous inner class
        greeting.greet();
    }
}

