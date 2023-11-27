package HashMap;

import java.util.HashMap;
import java.util.LinkedList;

public class PeopleClass {

    public static void main(String[] args) {
        //Object 'people'
        HashMap<String, Integer> people = new HashMap<>();
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i: people.keySet()) {
            System.out.println("Key is "+i+" and a Value is "+people.get(i));
        }
    }
}
