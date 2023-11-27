package HashMap;

import java.util.HashMap;

public class Countries {

    public static void main(String[] args) {

        HashMap<String, String> countries =  new HashMap<>();
        countries.put("Uganda", "Kampala");
        countries.put("UAE", "Abu Dhabi");
        countries.put("England", "London");
        countries.put("Germany", "Berlin");
        countries.put("Norway", "Oslo");
        countries.put("USA", "Washington DC");

        System.out.println(countries);

//        Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        for (String i: countries.values()) {
            System.out.println(i);
        }

        for (String i: countries.keySet()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : countries.keySet()) {
            System.out.println("key: " + i + " value: " + countries.get(i));
        }


    }
}
