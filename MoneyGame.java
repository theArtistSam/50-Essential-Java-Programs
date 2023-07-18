
/*
Activity 17: 
*/

import java.util.Scanner;
public class MoneyGame{
	 public static void main(String[] args) {
	 	// Create a Scanner object for user input
		 Scanner input = new Scanner(System.in);

		 // Prompt the user to enter the number of pennies
		 System.out.print("Enter the number of pennies: ");
		 double pennies = input.nextDouble();
 
		 // Prompt the user to enter the number of nickels
		 System.out.print("Enter the number of nickels: ");
		 double nickels = input.nextDouble();
 
		 // Prompt the user to enter the number of dimes
		 System.out.print("Enter the number of dimes: ");
		 double dimes = input.nextDouble();
 
		 // Prompt the user to enter the number of quarters
		 System.out.print("Enter the number of quarters: ");
		 double quarters = input.nextDouble();
 
		 // Calculate the total amount of money
		 double totalAmount = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
 
		 // Check if the total amount is equal to, greater than, or less than a dollar
		 if (totalAmount == 1) {
			 System.out.println("Congratulations! You won the game");
		 } else if (totalAmount > 1) {
			 System.out.println("The total amount is more than a dollar");
		 } else {
			 System.out.println("The total amount is less than a dollar");
		 }
	 	
	}	
}
