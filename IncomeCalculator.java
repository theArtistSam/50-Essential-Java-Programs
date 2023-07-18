/*
Activity 8: Income Calculation
*/

import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double payPerHour = 15.50; // Pay rate per hour
        double totalTax = 14 / 100; // Total tax rate

        System.out.print("Enter the pay rate for an hour: "); // Prompt for the pay rate per hour
        double payRate = input.nextDouble();

        System.out.print("Enter the number of hours worked each week: "); // Prompt for the number of hours worked in a week
        int noOfHrs = input.nextInt();

        double incomeBeforeTax = payRate * noOfHrs * 5; // Calculate income before tax for 5 weeks
        System.out.println("Payment before tax: $" + (int) incomeBeforeTax);

        double incomeAfterTax = incomeBeforeTax * (1 - totalTax); // Calculate income after tax
        System.out.println("Payment after tax: $" + (int) incomeAfterTax);

        double incomeSchool = incomeBeforeTax * 1 / 100; // Calculate income after school supplies and clothes tax
        System.out.println("Payment after school supplies and clothes: $" + (int) incomeSchool);

        double incomeSavingFunds = incomeBeforeTax * 25 / 100; // Calculate income after saving funds tax
        System.out.println("Payment after saving funds tax: $" + (int) incomeSavingFunds);

        double incomeAdditionalFunds = incomeBeforeTax * 0.125; // Calculate income after additional funds tax
        System.out.println("Payment after additional funds tax: $" + (int) incomeAdditionalFunds);
    }
}
