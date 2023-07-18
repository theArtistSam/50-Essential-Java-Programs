/*
Activity 9: Classification of a Number
*/

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        // Classify the number using if-else statements
        if (x > 0) {
            System.out.println("The number is positive: " + x);
        } else if (x < 0) {
            System.out.println("The number is negative: " + x);
        } else if (x == 0) {
            System.out.println("The number is equal to zero: " + x);
        }
    }
}
