package Lessons;

public class Strings {

    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String greeting = "Hello World";
        System.out.println(greeting.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(greeting.toLowerCase());

        String locateTxt = "let us please locate where 'locate' occurs!";
        System.out.println(locateTxt.indexOf("locate"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.concat(lastName));
    }
}
