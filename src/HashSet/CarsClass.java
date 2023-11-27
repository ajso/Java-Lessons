package HashSet;

import java.util.HashSet;

public class CarsClass {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("PickUp");
        cars.add("BMW");

//        To check whether an item exists in a HashSet, use the contains() method
        Boolean look = cars.contains("Mazda");

        System.out.println(look);

        for (String i: cars) {
            System.out.println(i);
        }
    }
}
