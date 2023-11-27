package ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes Benz");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        Collections.sort(cars);
        Collections.sort(myNumbers);

        System.out.println("===========Sorting Cars===========");
        for (String i: cars) {

            System.out.println(i);

        }

        System.out.println("===========Sorting Numbers===========");
        for (int x : myNumbers) {

            System.out.println(x);

        }
    }
}
