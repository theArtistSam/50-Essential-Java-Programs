/*
Activity 19: Discount Calculation
*/

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of packages purchased
        System.out.print("Enter the number of packages purchased: ");
        int packageAmount = input.nextInt();

        // Calculate the retail price based on the number of packages
        int retailPrice = packageAmount * 99;

        // Apply discount based on the number of packages
        if (packageAmount >= 10 && packageAmount <= 19) {
            System.out.println("You get a 20% discount: $" + (retailPrice * 20) / 100);
        } else if (packageAmount >= 20 && packageAmount <= 49) {
            System.out.println("You get a 30% discount: $" + (retailPrice * 30) / 100);
        } else if (packageAmount >= 40 && packageAmount <= 99) {
            System.out.println("You get a 40% discount: $" + (retailPrice * 40) / 100);
        } else if (packageAmount >= 100) {
            System.out.println("You get a 50% discount: $" + (retailPrice * 50) / 100);
        }
    }
}
