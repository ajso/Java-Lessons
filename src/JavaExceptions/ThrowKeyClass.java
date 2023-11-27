package JavaExceptions;

public class ThrowKeyClass {

    public void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 y.o");
        }else {
            System.out.println("Access granted - You are old enough");
        }
    }

    public static void main(String[] args) {
       ThrowKeyClass throwKeyClass = new ThrowKeyClass();
       throwKeyClass.checkAge(17);
    }
}
