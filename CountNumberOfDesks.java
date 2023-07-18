/*
Activity 5: Counting Number of Desks
*/

import java.util.Scanner;

public class CountNumberOfDesks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Students of class 1: "); // Prompt for number of students in class 1
        int class1 = input.nextInt();
        int class1Desks = class1 / 2;
        System.out.println("Class 1 desks: " + class1Desks);
        
        System.out.println("Enter number of Students of class 2: "); // Prompt for number of students in class 2
        int class2 = input.nextInt();
        int class2Desks = class1 / 2;
        System.out.println("Class 2 desks: " + class2Desks);
        
        System.out.println("Enter number of Students of class 3: "); // Prompt for number of students in class 3
        int class3 = input.nextInt();
        int class3Desks = class3 / 2;
        System.out.println("Class 3 desks: " + class3Desks);

        int totalNumberOfStudents = class1 + class2 + class3; // Calculate total number of students
        System.out.println("Total Number Of Students are: " + totalNumberOfStudents);

        int desksRequiredTotal = class2Desks + class2Desks + class3Desks; // Calculate total number of desks required
        System.out.println("Total number of desks required: " + desksRequiredTotal);
    }
}
