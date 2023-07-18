
/*
Question 05: Checking Roots of equation
*/

import java.lang.Math;
import java.util.Scanner;
public class RootsCheck{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of a: ");
		double a = input.nextDouble();

		System.out.println("Enter the value of b: ");
		double b = input.nextDouble();

		System.out.println("Enter the value of c: ");
		double c = input.nextDouble();

		double discriminant = (b * b - 4 * a * c);

		if(discriminant > 0){
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
			System.out.println("The equation has two roots: " + root1 + " and " + root2);  
		}
		else if(discriminant == 0){
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
			System.out.println("The equation has one root: " + root1);
		}
		else{
			System.out.println("The equation has no real roots");
		}



    }
}
