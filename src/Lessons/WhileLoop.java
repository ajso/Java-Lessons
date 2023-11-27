package Lessons;

public class WhileLoop {

    public static void main(String[] args) {
//        int x = 2;

        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            i++;
//            //breaks out of the loop if i=2
//            if(i==2){
//                break;
//            }
//        }

//        switch (x) {
//            case 1:
//                while (x > 10) {
//                    System.out.println(x);
//                    x++;
//                }
//                break;
//            case 2:
//                while (x < 10) {
//                    System.out.println(x);
//                    x++;
//                }
//                break;
//            default:
//                System.out.println(" No value of x.");
//        }
    }
}
