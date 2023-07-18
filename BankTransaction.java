/*
Question 6: Bank Transaction
*/

import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the amount for the transaction
        System.out.println("Enter amount for transaction: ");
        int amount = input.nextInt();

        System.out.println("Enter the total amount: ");
        double totalAmount = input.nextDouble();

        // Calculate the transaction amount after deducting the transaction fee
        double amountAfterTax = amount - 0.05;

        // Check if the amount is a multiple of 5 and if it is less than or equal to the total amount
        if (amount % 5 == 0 && amount <= totalAmount) {
            // Print the transaction amount after deducting the transaction fee
            System.out.printf("%5.2f\n", amountAfterTax);

            // Print the remaining total amount
            System.out.printf("%5.2f", totalAmount);
        } else {
            System.out.println("You cannot proceed with the transaction");
        }
    }
}
