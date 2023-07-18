/*
Activity 3: Amount Conversion
This program converts an amount given in dollars and cents into its equivalent number of quarters, dimes, nickels, and pennies.
*/

import java.util.Scanner;

public class CashierProgram{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount as decimal: ");
		double amount = input.nextDouble();
		System.out.println();
	
		double cents = amount * 100;
		System.out.println();
	
		double dollars = amount / 100; // Finding the number of dollars
		cents = cents % 100;
		System.out.println("Number of cents: " + cents);
		System.out.println();
	
		double noOfQuarters = cents / 25; // Finding the number of quarters
		double remainingCents = cents % 25;
		System.out.println("Number of Quarters: " + noOfQuarters);
		System.out.println();
	
		double noOfDimes = remainingCents / 10; // Finding the number of dimes
		remainingCents = remainingCents % 10;
		System.out.println("Number of Dimes: " + noOfDimes);
		System.out.println();
	
		double noOfNickels = remainingCents / 5; // Finding the number of nickels
		remainingCents = remainingCents % 5;
		System.out.println("Number of Nickels: " + noOfNickels);
		System.out.println();
	
		System.out.println("Number of Pennies: " + remainingCents); // Finding the number of pennies


	}
}

