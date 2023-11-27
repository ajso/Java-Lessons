package JavaOOP;

public class ConstClass {

    int x;

    public ConstClass() {
        this.x = 5;
    }

    public static void main(String[] args) {
        ConstClass main = new ConstClass();
        System.out.println(main.x);
    }
}
