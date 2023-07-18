/*
Activity 21: BMI Calculation
*/

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight of a person in pounds
        System.out.print("Enter the weight of a person in pounds: ");
        int weight = input.nextInt();

        // Prompt the user to enter the height of a person in inches
        System.out.print("Enter the height of a person in inches: ");
        int height = input.nextInt();

        // Calculate BMI using the provided formula
        int heightSquared = height * height;
        int bmi = (weight * 703) / heightSquared;

        // Determine the weight category based on the calculated BMI
        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Your weight is optimal");
        } else if (bmi < 18.5) {
            System.out.println("You're underweight");
        } else if (bmi > 25) {
            System.out.println("You're overweight");
        }
    }
}
