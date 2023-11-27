package JavaOOP;

public class ClassObj {

    int x = 5;

    public static void main(String[] args) {

        Recursion sc = new Recursion();
        int result = sc.sum(20);

        Profile pf = new Profile();


        ClassObj obj = new ClassObj();
        obj.x = 219;

        System.out.println(obj.x);

        System.out.println("=====Recursion=====");
        System.out.println(result);

        System.out.println("=====Profile=====");
        System.out.println("My name is "+pf.fname+" "+pf.lname+" and i\'m "+ pf.age+" years old.");

        ClassMethods2 cm2 = new ClassMethods2();
        cm2.fullThrottle();
        cm2.speed(200);
    }
}
