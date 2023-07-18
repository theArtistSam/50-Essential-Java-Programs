/*
Activity 22: Arithmetic Calculation
*/

import java.util.Scanner;

public class ArithmeticCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double x = 1.0;
        double y = 5.0;

        // Perform arithmetic calculation
        double z = (++x * y++) + (++y);

        // Print the result
        System.out.println(z--);
    }
}
