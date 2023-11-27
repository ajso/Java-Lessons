package ArrayLists;

import java.util.ArrayList;

public class CarsList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes Benz");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(2, "TRACTOR");

//       cars.get(2);
//        cars.size();
//        for (int i = 0; i<cars.size(); i++){
//            System.out.println(cars.get(i));
//        }

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
