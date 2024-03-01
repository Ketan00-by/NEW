package Array.Collection.Hashmap;
import java.util.*;
    public class Demo2 {
        public static void main(String[] args) {
            List<String> mhCities = new ArrayList<>();
            mhCities.add("Nagpur");
            mhCities.add("Pune");
            mhCities.add("Mumbai");

            List<String> mpCities = new ArrayList<>();
            mpCities.add("Bhopal");
            mpCities.add("Indore");
            mpCities.add("Riva");

            Map<String, List<String>> stateMap = new HashMap<>();
            stateMap.put("MadhyaPradesh", mpCities);
            stateMap.put("Maharashtra", mhCities);

            Map<String, Map<String, List<String>>> countryMap = new HashMap<>();
            countryMap.put("India", stateMap);

            for (Map.Entry<String, Map<String, List<String>>> countryEntry : countryMap.entrySet()) {
                String country = countryEntry.getKey();
                System.out.println("Country: " + country);

                Map<String, List<String>> stateMapForCountry = countryEntry.getValue();
                for (Map.Entry<String, List<String>> stateEntry : stateMapForCountry.entrySet()) {
                    String state = stateEntry.getKey();
                    List<String> cities = stateEntry.getValue();

                    // Print state and its cities
                    System.out.println("  State: " + state);
                    System.out.println("    Cities: " + cities);
                }
            }
        }
    }
