package JavaThreads;

public class IsAliveClass extends Thread{

    public static int amount = 0;

    public static void main(String[] args) {
        IsAliveClass isAliveClass = new IsAliveClass();
        isAliveClass.start();

        //Waiting for the thread to finish
        while (isAliveClass.isAlive()){
            System.out.println("Waiting....");
        }
        //update the amount and print the value
        System.out.println("Main " +amount);
        amount++;
        System.out.println("Main " +amount);
    }

    @Override
    public void run() {
        super.run();
        amount++;
    }
}
