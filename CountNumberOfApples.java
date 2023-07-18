
/*
Activity 4: Counting Number of Apples
This program calculates the number of apples each student will receive when distributing a given number of apples among a given number of students. It also calculates the number of remaining apples in the basket.
*/

import java.util.Scanner;

public class CountNumberOfApples{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of Students: "); // Obtaining Number of Students
		int n = input.nextInt();
		System.out.print("Enter number of Apples: "); // Obtaining Number of Apples
		int k = input.nextInt();
	
		int distribution = k / n;
		System.out.println("Number of Apples distributed to each student is: " + distribution); // Distributing Apples
	
		int remaining = k % n;
		System.out.print("The remaining Apples in the basket are: " + remaining); // Remaining Apples
	
	}
	
}
