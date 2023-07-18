/*
Activity 20: Shipping Charges Calculation
*/

import java.util.Scanner;

public class ShippingChargesCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight of the packages
        System.out.print("Enter the weight of packages purchased: ");
        int packageWeight = input.nextInt();

        // Calculate the shipping charges based on the weight of the packages
        if (packageWeight <= 2) {
            System.out.println("The shipping charges would be: $1.10");
        } else if (packageWeight > 2 && packageWeight <= 6) {
            System.out.println("The shipping charges would be: $2.20");
        } else if (packageWeight > 6 && packageWeight <= 10) {
            System.out.println("The shipping charges would be: $3.70");
        } else if (packageWeight > 10) {
            System.out.println("The shipping charges would be: $3.80");
        }
    }
}
