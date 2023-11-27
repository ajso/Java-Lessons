package JavaOOP;

public class ClassMethods {

    static void myStaticMethod(){
        System.out.println("Static methods can be accessed without creating an object of a class.");
    }

    public void myPublicMethod(){
        System.out.println("Public methods can only be accessed by creating an object of a class.");
    }

    public static void main(String[] args) {
        myStaticMethod();

        ClassMethods cm = new ClassMethods();
        cm.myPublicMethod();

    }
}
