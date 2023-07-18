/*
Activity 14: Object Weight Classification
*/

import java.util.Scanner;

public class WeightClassification {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the object's mass in kilograms
        System.out.print("Enter object's mass in kilograms: ");
        int mass = input.nextInt();

        // Calculate the weight of the object using the formula weight = mass * 9.8
        double weight = mass * 9.8;

        // Compare the weight of the object and display the classification
        if (weight > 1000) {
            System.out.println("The object is way too heavy");
        } else if (weight < 10) {
            System.out.println("The object is way too light");
        }
    }
}
