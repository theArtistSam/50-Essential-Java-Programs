/*
Question 1: Stocks Calculation
*/

import java.util.Scanner;

public class StocksCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of shares sold
        System.out.print("Enter the number of shares sold: ");
        double shares = input.nextDouble();

        // Prompt the user to enter the purchase price of each share
        System.out.print("Enter the purchase price of each share: ");
        double purchasePrice = input.nextDouble();

        // Prompt the user to enter the selling price of each share
        System.out.print("Enter the selling price of each share: ");
        double sellingPrice = input.nextDouble();

        // Calculate the amount invested
        double amountInvested = shares * purchasePrice;

        // Calculate the amount earned
        double amountEarned = shares * sellingPrice;

        // Display the total amount invested
        System.out.println("The total amount invested is: " + amountInvested);

        // Calculate the total service charges (on buy and sell)
        double serviceCharges = amountInvested * 0.015 + amountEarned * 0.015;

        // Display the total service charges
        System.out.println("The total service charges (on buy and sell) are: " + serviceCharges);

        // Calculate the amount gained or lost
        double amountGainOrLoss = amountEarned - amountInvested;

        // Display the total amount gained or lost
        System.out.println("The total amount gained or lost is: " + amountGainOrLoss);

        // Calculate the total amount after selling the stock (including service profit)
        double totalAmountAfterSelling = (amountInvested + amountGainOrLoss) - serviceCharges;

        // Display the total amount after selling the stock
        System.out.println("The total amount after selling the stock is: " + totalAmountAfterSelling);
    }
}
