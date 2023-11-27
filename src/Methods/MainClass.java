package Methods;

public class MainClass {

    public static void main(String[] args) {
        myMethod("Ecurut", 35);
//        myMethod();
        System.out.println("The returned answer is "+myInMethod(6));
        int z = myMultiple(79,88);
        System.out.println("The multiple of x and y is " + z);
    }
    static void myMethod(String fname, int age){
        System.out.println(fname + " I excellent at what he is doing.!!" + " He is just " +age+ ".");
    }
    static int myInMethod( int x){
        return 9+x;
    }

    static int myMultiple(int x, int y){
        return (x*y);
    }
}
