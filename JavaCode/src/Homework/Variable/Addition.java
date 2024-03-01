package Homework.Variable;

public class Addition {
        int add_int(int x, int y) {
            return x + y;
        }
        public static void main(String[] args) {
            Addition addOperation = new Addition();
            int z = addOperation.add_int(2, 4);
            System.out.println(z);
        }
    }
