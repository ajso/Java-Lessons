package JavaThreads;


//A code example where the value of the variable amount is unpredictable:

public class ConcurProblem extends Thread{

    public static int amount = 0;

    public static void main(String[] args) {

        ConcurProblem concurProblem = new ConcurProblem();
        concurProblem.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
        }

}
