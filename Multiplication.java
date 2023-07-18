import java.util.Scanner;

public class hello{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = input.nextInt();
		System.out.print("Enter second number: ");
		int b = input.nextInt();


		System.out.println("The multiplication is: " + a * b);


	}
}