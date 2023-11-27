package Interfaces;

public class DemoMultiInterface implements FirstInterface, SecondInterface{

    @Override
    public void myInterface() {
        System.out.println("This is the first Class");
    }

    @Override
    public void mySecondMethod() {

        System.out.println("This is the Second Class");
    }
}
