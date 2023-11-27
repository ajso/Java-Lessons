package ProjectX;

import java.util.Scanner;

public class DiscountPrice {
    final int percentage = 100;
    double calc(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Item Price:");
        double orig_price = scanner.nextDouble();
        System.out.println("Enter the Discount Percentage: ");
        double percentage_discount = scanner.nextDouble();

        double result = (percentage_discount/percentage)*orig_price;

        double newPrice = orig_price - result;

        return newPrice;
    }
}
