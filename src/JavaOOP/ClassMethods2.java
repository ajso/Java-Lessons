package JavaOOP;

public class ClassMethods2 {

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can.");
    }

    public void speed(int maxSpeed){
        System.out.println("The max speed is "+maxSpeed);
    }

    public static void main(String[] args) {
        ClassMethods2 myCar = new ClassMethods2();
        myCar.fullThrottle();
        myCar.speed(240);

    }
}
