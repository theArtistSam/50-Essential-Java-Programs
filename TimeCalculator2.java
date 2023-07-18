/*
Activity 22: Time Calculator
*/

import java.util.Scanner;

public class TimeCalculator2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();

        // Calculate the number of minutes, hours, and days
        int minutes = seconds / 60;
        int hours = seconds / 3600;
        int days = seconds / 86400;

        // Determine the appropriate time unit based on the number of seconds entered
        if (seconds >= 60 && seconds < 3600) {
            System.out.println("The number of minutes are: " + minutes + " minutes.");
        } else if (seconds >= 3600 && seconds < 86400) {
            System.out.println("The number of hours are: " + hours + " hours.");
        } else if (seconds >= 86400) {
            System.out.println("The number of days in these seconds are: " + days + " days.");
        }
    }
}
