package JavaThreads;

public class ExtendThread extends Thread{

    public static void main(String[] args) {
        ExtendThread extendThread = new ExtendThread();
        extendThread.start();
    }
    @Override
    public void run() {
        System.out.println("This Thread is running in the background");
    }
}
