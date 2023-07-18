/*
Activity 10: Finding the Smallest Number
*/

import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter a number x: ");
        int x = input.nextInt();

        System.out.print("Enter a number y: ");
        int y = input.nextInt();

        System.out.print("Enter a number z: ");
        int z = input.nextInt();

        // Compare the numbers to find the smallest one
        if (x < y && x < z) {
            System.out.println("X is the smallest number: " + x);
        } else if (y < x && y < z) {
            System.out.println("Y is the smallest number: " + y);
        } else if (z < x && z < y) {
            System.out.println("Z is the smallest number: " + z);
        }
    }
}
