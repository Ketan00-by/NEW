package Array;

public class Largest {
    public static int getLargest(int numbers[]){
        int Largest = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {4,23,42,7,2};
        System.out.println("largest num : " + getLargest(numbers));
    }
}