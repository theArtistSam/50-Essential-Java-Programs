/*
Activity 7: Milk Profit Calculation
*/

import java.util.Scanner;

public class MilkProfitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cartonPrice = 3.78; // Price of a carton
        double oneLiterMilk = 0.38; // Price of one liter of milk
        double oneGallonMilk = 0.38 * 3.78; // Price of one gallon of milk
        double cartonProfit = 0.27; // Profit per carton

        System.out.print("Enter the total amount of milk (in gallons): "); // Prompt for the total amount of milk in gallons
        int amount = input.nextInt();

        double noOfCartons = amount / cartonPrice; // Calculate the number of cartons producing milk
        System.out.println("Number of cartons producing milk: " + (int) noOfCartons);

        double cost = noOfCartons * oneGallonMilk; // Calculate the cost of producing milk
        System.out.println("Cost of producing milk: $" + cost);

        double profit = noOfCartons * cartonProfit; // Calculate the profit of producing milk
        System.out.print("Profit of producing milk: $" + profit);
    }
}
