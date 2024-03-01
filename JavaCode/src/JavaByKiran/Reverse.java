package JavaByKiran;

public class Reverse {
    public static void main(String[] args) {
        String k = "Java by kiran";
        String d = reverseString(k);

        System.out.println("Original: " + k);
        System.out.println("Reversed: " + d);
    }

    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}


