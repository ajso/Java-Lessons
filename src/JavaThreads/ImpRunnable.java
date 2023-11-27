package JavaThreads;

public class ImpRunnable implements Runnable{

    public static void main(String[] args) {
        ImpRunnable impRunnable = new ImpRunnable();
        Thread thread = new Thread(impRunnable);
        thread.start();
        System.out.println("This code is outside of the thread");

    }
    @Override
    public void run() {
        System.out.println("We are implementing runnable to use threads");
    }
}
