/*
Question 10: Circle Point Check
*/

import java.lang.Math;
import java.util.Scanner;

public class CirclePointCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define the center coordinates of the circle and its radius
        int x1 = 0;
        int y1 = 0;
        int radius = 10;

        // Prompt the user to enter the x and y coordinates of the point
        System.out.print("Enter the x point: ");
        int x2 = input.nextInt();

        System.out.print("Enter the y point: ");
        int y2 = input.nextInt();

        // Calculate the distance between the point and the center of the circle
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // Check if the distance is less than or equal to the radius
        if (distance <= radius) {
            System.out.println("The point (" + x2 + ", " + y2 + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x2 + ", " + y2 + ") is outside the circle.");
        }
    }
}
