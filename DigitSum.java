/*
Activity 10: Digit Sum
*/

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int lessThan10 = number % 10; // Obtaining the digit in the ones place
        number /= 10;                           
        int tens = number % 10;      // Obtaining the digit in the tens place
        number /= 10;                           
        int hundreds = number % 10;  // Obtaining the digit in the hundreds place
        number /= 10;                           
        int sum = hundreds + tens + lessThan10; // Calculating the sum of the digits

        System.out.println("The sum of the digits is " + sum);
    }
}
