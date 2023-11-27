package Methods;

public class MethodIfElse {

    public static void main(String[] args) {
        checkAge(19);
    }

    static void checkAge(int age){
        if(age < 20){
            System.out.println("Access denied - You are still a minor");
        }else{
            System.out.println("Access granted - You are an adult.");
        }
    }
}
