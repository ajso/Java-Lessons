import ReverseString.UsingStaticMethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UsingStaticMethod staticMethod = new UsingStaticMethod();
        Scanner scanner = new Scanner(System.in);
        System.out.println("============Reverse Text Using Static Method=============");
        System.out.println("Enter Text to Reverse:");
        String str = scanner.nextLine();
        System.out.println("The Reversed word is - " +staticMethod.reverse(str));
        System.out.println("============End=============");

    }

}