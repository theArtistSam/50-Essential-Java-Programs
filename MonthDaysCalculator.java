/*
Question 10: Month Days Calculation
*/

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the month (1-12)
        System.out.println("Enter month (1-12): ");
        int month = input.nextInt();

        // Prompt the user to enter the year
        System.out.println("Enter any year: ");
        int year = input.nextInt();

        // Check the number of days in the given month based on the month and year
        if (month == 1) {
            System.out.println("January " + year + " has 31 days");
        } else if (month == 2) {
            // Check if it's a leap year (divisible by 4 and not divisible by 100, or divisible by 400)
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("February " + year + " has 29 days");
            } else {
                System.out.println("February " + year + " has 28 days");
            }
        } else if (month == 3) {
            System.out.println("March " + year + " has 31 days");
        } else if (month == 4) {
            System.out.println("April " + year + " has 30 days");
        } else if (month == 5) {
            System.out.println("May " + year + " has 31 days");
        } else if (month == 6) {
            System.out.println("June " + year + " has 30 days");
        } else if (month == 7) {
            System.out.println("July " + year + " has 31 days");
        } else if (month == 8) {
            System.out.println("August " + year + " has 31 days");
        } else if (month == 9) {
            System.out.println("September " + year + " has 30 days");
        } else if (month == 10) {
            System.out.println("October " + year + " has 31 days");
        } else if (month == 11) {
            System.out.println("November " + year + " has 30 days");
        } else if (month == 12) {
            System.out.println("December " + year + " has 31 days");
        } else {
            System.out.println("Invalid month number!");
        }
    }
}
