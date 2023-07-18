/*
Question 7: Checking Palindrome
*/

import java.util.Scanner;

public class PalindromeThreeDigit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a three-digit integer
        System.out.println("Enter a three-digit integer: ");
        int integer = input.nextInt();

        // Extract the digits from the integer
        int firstInteger = integer / 100;
        int secondInteger = integer / 10 % 10;
        int thirdInteger = integer % 10;

        // Rearrange the digits to form a new integer
        int newInteger = thirdInteger * 100 + secondInteger * 10 + firstInteger;

        // Check if the new integer is equal to the original integer
        if (integer == newInteger) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }
}
