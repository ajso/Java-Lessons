package JavaOOP;

public class FinalClass {

    final int x= 10;
    final double PI = 3.14;

    public static void main(String[] args) {

        FinalClass finalClass = new FinalClass();
        System.out.println(finalClass.x);
        myStaticMethod();

        finalClass.myPublicMethod();

    }

//    A static method means that it can be accessed without creating an object of the class, unlike public:
    static void myStaticMethod(){
        System.out.println("This is a static method.");
    }

//    public methods can be accessed by creating an object of a class:
    public void myPublicMethod(){
        System.out.println("Creating an object of a class to access a public method.");
    }
}
