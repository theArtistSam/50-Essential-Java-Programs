/*
Activity 6: Comparison Operators
*/

public class ComparisonOperators {
    public static void main(String[] args) {
        // Define the variables
        int x = 3;
        int y = 4;
        int z = 7;
        int w = 1;

        // Perform comparison operations and display the results using System.out.println()
        System.out.println("x == y: " + (x == y));                  // Check if x is equal to y
        System.out.println("x != z: " + (x != z));                  // Check if x is not equal to z
        System.out.println("y == z – 3: " + (y == z - 3));          // Check if y is equal to z minus 3
        System.out.println("!(z > w): " + !(z > w));                // Check if z is not greater than w
        System.out.println("x + y < z: " + (x + y < z));            // Check if the sum of x and y is less than z
    }
}
