/*
Activity 12: Roman Numerals
*/

import java.util.Scanner;

public class RomanNumers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        // Convert the number to Roman numerals
        if (x == 1) {
            System.out.println("Roman Numeral: I");
        } else if (x == 2) {
            System.out.println("Roman Numeral: II");
        } else if (x == 3) {
            System.out.println("Roman Numeral: III");
        } else if (x == 4) {
            System.out.println("Roman Numeral: IV");
        } else if (x == 5) {
            System.out.println("Roman Numeral: V");
        } else if (x == 6) {
            System.out.println("Roman Numeral: VI");
        } else if (x == 7) {
            System.out.println("Roman Numeral: VII");
        } else if (x == 8) {
            System.out.println("Roman Numeral: VIII");
        } else if (x == 9) {
            System.out.println("Roman Numeral: IX");
        } else if (x == 10) {
            System.out.println("Roman Numeral: X");
        }
    }
}
