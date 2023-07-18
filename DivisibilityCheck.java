/*
Question 4: Divisibility Check
*/

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is divisible by both 5 and 6
        System.out.println("The number is divisible by both 5 and 6: " + (num % 5 == 0 && num % 6 == 0));

        // Check if the number is divisible by either 5 or 6
        System.out.println("The number is divisible by 5 or 6: " + (num % 5 == 0 || num % 6 == 0));

        // Check if the number is divisible by either 5 or 6 but not both
        System.out.println("The number is divisible by either 5 or 6 but not both: " + (num % 5 == 0 ^ num % 6 == 0));
    }
}
