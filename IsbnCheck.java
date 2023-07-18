/*
Question 09: ISBN Number
*/

import java.util.Scanner;

public class IsbnCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the 9 digits of the ISBN
        System.out.println("Enter 9 digits of ISBN as integers, and press Enter after every digit entered: ");
        int isbnDigit1 = input.nextInt();
        int isbnDigit2 = input.nextInt();
        int isbnDigit3 = input.nextInt();
        int isbnDigit4 = input.nextInt();
        int isbnDigit5 = input.nextInt();
        int isbnDigit6 = input.nextInt();
        int isbnDigit7 = input.nextInt();
        int isbnDigit8 = input.nextInt();
        int isbnDigit9 = input.nextInt();

        // Calculate the checksum
        int checkSum = (isbnDigit1 * 1 + isbnDigit2 * 2 + isbnDigit3 * 3 + isbnDigit4 * 4 + isbnDigit5 * 5 + isbnDigit6 * 6 + isbnDigit7 * 7 + isbnDigit8 * 8 + isbnDigit9 * 9) % 11;

        // Check if the checksum is 10
        if (checkSum == 10) {
            System.out.println("The ISBN-10 number is: " + isbnDigit1 + isbnDigit2 + isbnDigit3 + isbnDigit4 + isbnDigit5 + isbnDigit6 + isbnDigit7 + isbnDigit8 + isbnDigit9 + "X");
        } else {
            System.out.println("The ISBN-10 number is: " + isbnDigit1 + isbnDigit2 + isbnDigit3 + isbnDigit4 + isbnDigit5 + isbnDigit6 + isbnDigit7 + isbnDigit8 + isbnDigit9 + checkSum);
        }
    }
}
