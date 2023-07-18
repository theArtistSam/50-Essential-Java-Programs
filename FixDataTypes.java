
/*

Activity 2: Fixing and Showing the outputs of the statements
*/

public class FixDataTypes{
	public static void main(String[] args) {

		  // Printing amount as float and exponential
		  System.out.printf("amount is %f %e\n", 32.32, 32.32);
        
		  // Printing amount as float and exponential (with different value)
		  System.out.printf("amount is %f %e\n", 32.327, 32.32);
		  
		  // Printing boolean value with width of 5
		  System.out.printf("%5b\n", (1 > 2));
		  
		  // Printing string with width of 4
		  System.out.printf("%4s\n", "Java");
		  
		  // Printing boolean value with left alignment and width of 6, followed by string
		  System.out.printf("%-6b%s\n",(1 > 2), "Java");
		  
		  // Printing boolean value with left alignment and width of 6, followed by string (with different width)
		  System.out.printf("%-6b%-5s\n",(1 > 2), "Java");
	}
}
