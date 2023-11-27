package JavaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberClass {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> i = numbers.iterator();

//        To remove an item from a collection
        while (i.hasNext()){
            Integer x = i.next();
            if(x<10){
                i.remove();
            }
        }

        System.out.println(numbers);
    }
}
