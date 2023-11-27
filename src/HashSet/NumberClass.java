package HashSet;

import java.util.HashSet;

public class NumberClass {

    public static void main(String[] args) {
        HashSet<Integer> myNumbers = new HashSet<>();

        myNumbers.add(5);
        myNumbers.add(8);
        myNumbers.add(3);
        myNumbers.add(18);
        myNumbers.add(2);
        myNumbers.add(23);


        System.out.println(myNumbers);
        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (myNumbers.contains(i)) {
                System.out.println(i + " is found.");
            }else {
                System.out.println(i + " is Not found");
            }
        }
    }
}