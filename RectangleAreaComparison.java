/*
Activity 13: Rectangle Area Comparison
*/

import java.util.Scanner;

public class RectangleAreaComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of rectangle 1
        System.out.print("Enter the length of rectangle 1: ");
        int length1 = input.nextInt();

        // Prompt the user to enter the width of rectangle 1
        System.out.print("Enter the width of rectangle 1: ");
        int width1 = input.nextInt();

        // Calculate the area of rectangle 1
        int area = length1 * width1;

        // Prompt the user to enter the length of rectangle 2
        System.out.print("Enter the length of rectangle 2: ");
        int length2 = input.nextInt();

        // Prompt the user to enter the width of rectangle 2
        System.out.print("Enter the width of rectangle 2: ");
        int width2 = input.nextInt();

        // Calculate the area of rectangle 2
        int area2 = length2 * width2;

        // Compare the areas of the rectangles and display the result
        if (area == area2) {
            System.out.println("Both rectangles have the same area");
        } else if (area > area2) {
            System.out.println("Rectangle 1 has a larger area than rectangle 2");
        } else if (area < area2) {
            System.out.println("Rectangle 2 has a larger area than rectangle 1");
        }
    }
}
