package JavaByKiran;

public class StringReversal {
        public static void main(String[] args) {
            String name = "Hello world";
            System.out.println(name);
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.print(name.charAt(i));
            }
        }
    }
