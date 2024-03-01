package Array.Collection.Hashmap;
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        String inputString = "KETANKUNAl";
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            if (charFrequencyMap.containsKey(c)) {
                charFrequencyMap.put(c, charFrequencyMap.get(c) + 1);
            } else {
                charFrequencyMap.put(c, 1);
            }
        }
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
