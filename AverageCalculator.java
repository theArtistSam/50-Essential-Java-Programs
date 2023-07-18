/*
Average Calculator
This program calculates the average of three numbers (num1, num2, num3) and displays the result.
*/

public class AverageCalculator{
	public static void main(String[] args) {

		int num1 = 125; // Declaring num1
		int num2 = 28; // Declaring num2
		int num3 = -25; // Declaring num3
		int average = (num1 + num2 + num3) / 3;
	
		// Displaying the values of num1, num2, num3, and the average
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("The average of num1, num2, and num3 is: " + average);

	}
}