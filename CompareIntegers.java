/*
Activity 11: Comparing Integers
*/

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter an integer x: ");
        int x = input.nextInt();

        System.out.print("Enter an integer y: ");
        int y = input.nextInt();

        System.out.print("Enter an integer z: ");
        int z = input.nextInt();

        // Compare the integers to determine the equality
        if (x == y && x == z && y == x && y == z && z == x && z == y) {
            System.out.println("All the integers are equal to each other: 3");
        } else if ((x == y && x != z) || (x != y && x == z && y == x && y != z) ||
                   (y != x && y == z && z == x && z != y) || (z != x && z == y)) {
            System.out.println("Two integers are equal to each other: 2");
        } else if (x != y && x != z && y != x && y != z && z != x && z != y) {
            System.out.println("None of them are equal to each other: 0");
        }
    }
}
