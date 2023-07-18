/*
Activity 8: Comparison of Two Numbers
*/

import java.util.Scanner;

public class ConditionalStructure {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter a number");
        int x = input.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter another number");
        int y = input.nextInt();

        // Compare the two numbers using if-else statements
        if (x > y) {
            System.out.println("y is smaller than x: " + y);
        } else if (x < y) {
            System.out.println("x is smaller than y: " + x);
        }
    }
}
