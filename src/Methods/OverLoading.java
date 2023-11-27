package Methods;

import javax.swing.text.Style;

public class OverLoading {

    public static void main(String[] args) {

        System.out.println(" Integers add "+ plusMethod(54, 31));
        System.out.println(" This method is overridden. double added " + plusMethod(5.7, 81.9));

    }

    static int plusMethod(int x, int y){
        return x+y;
    }

    static double plusMethod( double x, double y){
        return x+y;
    }
}
