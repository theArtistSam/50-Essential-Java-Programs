/*
Activity 6: Number of Hours
*/

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: "); // Prompt for the number of minutes
        double minutes = input.nextDouble();
        double hours = minutes / 60; // Calculate the number of hours
        System.out.println("Number of hours: " + (int)hours);
        
        double minutesAfter = minutes % 60; // Calculate the remaining minutes
        System.out.println("Number of minutes: " + minutesAfter);
        
        System.out.println("Time in hours and minutes: " + (int)hours + ":" + (int)minutesAfter);
    }
}
