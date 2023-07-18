/*
Activity 5: Logical Expressions
*/

public class LogicalExpressions {
    public static void main(String[] args) {
        // Define the variables
        int x = 10;
        int y = 15;
        int z = 20;

        // Display the result of the logical expressions using System.out.println()
        System.out.println(!(x > 10));                         // Check if x is not greater than 10
        System.out.println(x <= 5 || y < 15);                  // Check if x is less than or equal to 5 or y is less than 15
        System.out.println((x != 5) && (y != z));              // Check if x is not equal to 5 and y is not equal to z
        System.out.println(x >= z || (x + y >= z));            // Check if x is greater than or equal to z or the sum of x and y is greater than or equal to z
        System.out.println((x <= y - 2) && (y >= z) || (z - 2 != 20));  // Check if x is less than or equal to y minus 2 and y is greater than or equal to z or z minus 2 is not equal to 20
    }
}
