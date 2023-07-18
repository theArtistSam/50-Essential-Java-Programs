/*
Question 8: Shipping Charges Calculation
*/

import java.util.Scanner;

public class ShippingChargesCalculation2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight of the packages purchased
        System.out.print("Enter the weight of packages purchased: ");
        int packageWeight = input.nextInt();

        // Calculate the shipping charges based on the package weight
        if (packageWeight <= 1) {
            System.out.println("The shipping charges would be: $3.50");
        } else if (packageWeight > 1 && packageWeight <= 3) {
            System.out.println("The shipping charges would be: $5.50");
        } else if (packageWeight > 3 && packageWeight <= 10) {
            System.out.println("The shipping charges would be: $8.50");
        } else if (packageWeight > 10 && packageWeight <= 20) {
            System.out.println("The shipping charges would be: $10.50");
        }
    }
}
