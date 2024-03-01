package Array.Collection.Hashmap;
import java.util.*;
    public class Demo1 {
        public static void main(String[] args) {
            List<String> mhCities = new ArrayList<>();
            mhCities.add("'Nagpur");
            mhCities.add("Pune");
            mhCities.add("Mumbai");
            List<String> mpCities = new ArrayList<>();
            mpCities.add("'Bhopal");
            mpCities.add("Indore");
            mpCities.add("Riva");
            Map<String, List<String>> stateMap = new HashMap<>();
            stateMap.put("MadhyaPradesh", mpCities);
            stateMap.put("Maharashtra", mhCities);
            Map<String, Map<String, List<String>>> countryMap = new HashMap<>();
            countryMap.put("India", stateMap);
            System.out.println(countryMap);
        }
    }


