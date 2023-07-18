/*
Activity 9: Seat Income Calculation
*/

import java.util.Scanner;

public class SeatIncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seatA = 20; // Price of seat in class A
        int seatB = 15; // Price of seat in class B
        int seatC = 10; // Price of seat in class C
        int seatD = 5;  // Price of seat in class D

        System.out.print("Enter the number of seats in class A: "); // Prompt for the number of seats in class A
        int seatsA = input.nextInt();
        int seatACost = seatsA * seatA; // Calculate the income from class A seats

        System.out.print("Enter the number of seats in class B: "); // Prompt for the number of seats in class B
        int seatsB = input.nextInt();
        int seatBCost = seatsB * seatB; // Calculate the income from class B seats

        System.out.print("Enter the number of seats in class C: "); // Prompt for the number of seats in class C
        int seatsC = input.nextInt();
        int seatCCost = seatsC * seatC; // Calculate the income from class C seats

        System.out.print("Enter the number of seats in class D: "); // Prompt for the number of seats in class D
        int seatsD = input.nextInt();
        int seatDCost = seatsD * seatD; // Calculate the income from class D seats

        int totalIncome = seatACost + seatBCost + seatCCost + seatDCost; // Calculate the total income
        System.out.println("The total income is $" + totalIncome);
    }
}
