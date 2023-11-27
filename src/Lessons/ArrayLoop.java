package Lessons;

public class ArrayLoop {

    public static void main(String[] args) {
        String[] cars = {"Mercedes", "Mitshubishi", "Volvo", "Mazdar"};

        for(int i = 0; i< cars.length; i++){
            System.out.println(cars[i]);
        }

//        Using for-each
        for(String i: cars){
            System.out.println(i);
        }
    }
}
