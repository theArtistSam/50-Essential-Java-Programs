/*
Question 3: Chess Game
*/

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first row and column
        System.out.print("Enter a number (1-8) for the first row: ");
        int row1 = input.nextInt();

        System.out.print("Enter a number (1-8) for the first column: ");
        int column1 = input.nextInt();

        // Prompt the user to enter the second row and column
        System.out.print("Enter a number (1-8) for the second row: ");
        int row2 = input.nextInt();

        System.out.print("Enter a number (1-8) for the second column: ");
        int column2 = input.nextInt();

        // Check if the movement is possible
        if ((row1 - row2 <= 1) && (column1 - column2 <= 1) && ((row1 != column1 && row2 == column2) || (row1 == column1 && row2 != column2))) {
            System.out.println("Yes! The movement is possible.");
        } else {
            System.out.println("Nope! The movement is not possible.");
        }
    }
}
