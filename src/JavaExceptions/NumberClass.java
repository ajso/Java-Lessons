package JavaExceptions;

public class NumberClass {

    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3, 4};
            System.out.println(myNumbers[10]);

        }catch (Exception e){

            System.out.println("Something Went wrong");
        }finally {
            System.out.println("Position 10 doesn't exist in the array");
        }
    }
}
