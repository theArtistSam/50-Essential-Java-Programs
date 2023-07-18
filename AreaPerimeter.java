
/*

Activity 2: Calculate Area + Perimeter
This program calculates the area and perimeter of a rectangle based on user input for width and length.
*/

import java.util.Scanner;

public class AreaPerimeter{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the width: ");
		int width = input.nextInt();
		System.out.println();
	
		System.out.print("Enter the length: ");
		int length = input.nextInt();
		System.out.println();
	
		int area = length * width;
		System.out.println("Area = " + area);
	
		int perimeter = 2 * (length + width);
		System.out.println("Perimeter = " + perimeter);
	
	}
}
