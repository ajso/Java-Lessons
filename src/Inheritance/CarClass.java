package Inheritance;

public class CarClass extends VehicleClass{

    private String modelName = "RAM";

    public static void main(String[] args) {
        CarClass carClass = new CarClass();

        carClass.honk();
        System.out.println(carClass.brand+" With a speed of "+maxSpeed(250));
        System.out.println("Model name is "+carClass.modelName);

    }
}
