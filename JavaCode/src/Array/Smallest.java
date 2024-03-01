package Array;

public class Smallest {
    public static int getSmallest(int numbers[]){
        int smallest = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {4,23,42,7,2};
        System.out.println("smallest num : " + getSmallest(numbers));
    }
}

