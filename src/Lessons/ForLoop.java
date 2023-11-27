package Lessons;

public class ForLoop {

    public static void main(String[] args) {
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//        }

//        for(int i=0; i<=10; i+=2){
//            System.out.println(i);
//        }

        String[] cars = {"Volvo", "Ford", "Mazda", "Benz"};
        for(String i: cars){
            System.out.println(i);
        }
    }
}
