package JavaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraterClass {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes Benz");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> i = cars.iterator();

//        System.out.println(i.next());
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
