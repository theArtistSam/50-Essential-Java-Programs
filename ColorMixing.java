/*
Activity 16: Color Mixing
*/

import java.util.Scanner;

public class ColorMixing {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first primary color
        System.out.print("Enter any primary color (1: red, 2: blue, and 3: yellow): ");
        int color1 = input.nextInt();

        // Prompt the user to enter the second primary color
        System.out.print("Enter another primary color (1: red, 2: blue, and 3: yellow): ");
        int color2 = input.nextInt();

        // Check if the entered colors are valid primary colors
        if (color1 != 1 && color1 != 2 && color1 != 3) {
            System.out.println("You didn't enter a valid primary color");
        } else if (color2 != 1 && color2 != 2 && color2 != 3) {
            System.out.println("You didn't enter a valid primary color");
        } else {
            // Check the combination of primary colors and print the resulting color
            if (color1 == 1 && color2 == 2) {
                System.out.println("You get purple");
            } else if (color1 == 1 && color2 == 3) {
                System.out.println("You get orange");
            } else if (color1 == 2 && color2 == 3) {
                System.out.println("You get green");
            }
        }
    }
}
