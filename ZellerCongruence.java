/*
Question 9: Zeller's Congruence
*/

import java.util.Scanner;

public class ZellerCongruence {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.print("Enter month: ");
        int m = input.nextInt();

        // Prompt the user to enter the day of the month
        System.out.print("Enter day of month: ");
        int q = input.nextInt();

        // Prompt the user to enter the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        int h;

        int j = year / 100;
        int k = year % 100;

        if (m == 1) {
            m = m + 12;
            k = k - 1;
        } else if (m == 2) {
            m = m + 13;
            k = k - 1;
        }

        // Calculate Zeller's congruence
        h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Determine the day of the week based on the calculated value of h
        if (h == 0) {
            System.out.println("Day of the week is: Saturday");
        } else if (h == 1) {
            System.out.println("Day of the week is: Sunday");
        } else if (h == 2) {
            System.out.println("Day of the week is: Monday");
        } else if (h == 3) {
            System.out.println("Day of the week is: Tuesday");
        } else if (h == 4) {
            System.out.println("Day of the week is: Wednesday");
        } else if (h == 5) {
            System.out.println("Day of the week is: Thursday");
        } else if (h == 6) {
            System.out.println("Day of the week is: Friday");
        }
    }
}
