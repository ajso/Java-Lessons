package JavaLambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListLamb {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(42);
        numbers.add(12);
        numbers.add(26);
        numbers.add(13);

        //lambda expression to display all numbers
        numbers.forEach((n)->{
            System.out.println(n);
        });

        System.out.println("=====Using Consumer===============");
        //or
        Consumer<Integer> list = (x)->{
            System.out.println(x);
        };
        numbers.forEach(list);
    }
}
