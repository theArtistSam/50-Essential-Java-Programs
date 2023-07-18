
/*
Activity 18: 
*/

import java.util.Scanner;
public class BookStorePoints{
	 public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of books purchased last month
		System.out.print("Enter the number of books you purchased last month: ");
		int books = input.nextInt();

		// Calculate the loyalty points based on the number of books
		int loyaltyPoints;

		if (books == 0) {
			loyaltyPoints = 0;
		} else if (books == 1) {
			loyaltyPoints = 5;
		} else if (books == 2) {
			loyaltyPoints = 15;
		} else if (books == 3) {
			loyaltyPoints = 30;
		} else if (books == 4) {
			loyaltyPoints = 60;
		} else {
			loyaltyPoints = 0; // Default value if the number of books is greater than 4
		}

		// Display the loyalty points earned
		System.out.println("You earned " + loyaltyPoints + " points");

	 	
	}	
}
