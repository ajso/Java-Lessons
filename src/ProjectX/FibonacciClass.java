package ProjectX;

import java.util.Scanner;

public class FibonacciClass {

    public static void main(String[] args) {

       int a = 0;
       int b = 1;
       int c;

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of times to print the fibonacci:");
       int count = scanner.nextInt();

       System.out.print(a+", "+b+", ");

       for (int i = 2; i<count; i++){
           c=a+b;
           System.out.print(c+ ", ");
           a=b;
           b=c;
       }
    }
}
