package JavaOOP;

abstract class AbstractClass {

    public String fname = "Andrew";
    public int age = 35;
    public abstract void study();
}

//subclass
class Student extends AbstractClass{

    public int gradYear = 2015;
    public void study(){

        System.out.println("I am grateful to GOD");

    }

}

class AllDetails{

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("My name is " + student.fname + ", I am "+student.age +".");
        System.out.println("I graduated in "+student.gradYear);
        student.study();
    }
}
