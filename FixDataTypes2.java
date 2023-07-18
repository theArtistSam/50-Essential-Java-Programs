/*
Activity 3: Fixing and Showing the Outputs
*/

public class FixDataTypes2 {
    public static void main(String[] args) {
        // The following lines of code are commented out because they contain incorrect formatting:
        // System.out.printf("%5d %d", 1, 2, 3); (Here three variables are given while the formatting is for only 2)
        // System.out.printf("%5d %f", 1); (Here only one variable is given while the formatting is for 2! Also, the number is an integer, not a float)
        // System.out.printf("%5d %f", 1, 2); (This one works perfectly fine! Also, the numbers are integers, not floats)

        // Printing integers with left alignment and width of 1, followed by integers with default alignment
        System.out.printf("%-1d %d %d\n", 1, 2, 3);

        // Printing integer with left alignment and width of 1
        System.out.printf("%-1d\n", 1);

        // Printing integers with left alignment and width of 1, followed by integer with default alignment
        System.out.printf("%-1d %d\n", 1, 2);
    }
}
