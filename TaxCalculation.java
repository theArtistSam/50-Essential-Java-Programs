/*
Question 5: Tax Calculation
*/

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the pay and name
        System.out.println("Enter your pay: ");
        double pay = input.nextDouble();

        System.out.println("Enter your Name: ");
        String name = input.next();

        // Calculate the tax amounts
        double federalTax = pay * 0.15;
        double stateTax = pay * 0.035;
        double socialSecurity = pay * 0.0575;
        double medicareTax = pay * 0.0275;
        double pensionPlan = pay * 0.05;
        double healthInsurance = 75;
        double netPay = pay - federalTax - stateTax - socialSecurity - medicareTax - pensionPlan - healthInsurance;

        // Print the pay slip
        System.out.println("\n" + name);
        System.out.printf("%-25s $ %5.2f\n", "Gross Amount:", pay);
        System.out.printf("%-25s $ %7.2f\n", "Federal Tax:", federalTax);
        System.out.printf("%-25s $ %7.2f\n", "State Tax:", stateTax);
        System.out.printf("%-25s $ %7.2f\n", "Social Security Tax:", socialSecurity);
        System.out.printf("%-25s $ %7.2f\n", "Medicare/Medicaid Tax:", medicareTax);
        System.out.printf("%-25s $ %7.2f\n", "Pension Plan:", pensionPlan);
        System.out.printf("%-25s $ %7.2f\n", "Health Insurance:", healthInsurance);
        System.out.printf("%-25s $ %7.2f\n", "Net Pay:", netPay);
    }
}
