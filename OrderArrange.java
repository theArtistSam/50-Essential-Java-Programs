
/*
Question 07: Arranging Order of numbers
*/

import java.util.Scanner;
public class OrderArrange{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
        System.out.print("Enter an integer x: ");
	 	int x = input.nextInt();
	 	
	 	System.out.print("Enter an integer y: ");
	 	int y = input.nextInt();
	 	
	 	System.out.print("Enter an integer z: ");
	 	int z = input.nextInt();
	 	 
	    if(x <= y && x <= z && y <= z){
	    	System.out.print(x);
	    	System.out.print(y);
	    	System.out.print(z);
	    }
	    else if(x <= y && x <= z && z <= y){
			System.out.print(x);
	    	System.out.print(z);
	    	System.out.print(y);
		}
		else if(y <= x && y <= z && x <= z){
			System.out.print(y);
	    	System.out.print(x);
	    	System.out.print(z);
		}
		else if(y <= x && y <= z && z <= x){
			System.out.print(y);
	    	System.out.print(z);
	    	System.out.print(x);
		}
		else if(z <= x && z <= y && x <= y){
			System.out.print(z);
	    	System.out.print(x);
	    	System.out.print(y);
		}
		else if(z <= x && z <= y && y <= x){
			System.out.print(z);
	    	System.out.print(y);
	    	System.out.print(x);
		}



	}
}
