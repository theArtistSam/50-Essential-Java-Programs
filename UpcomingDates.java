
/*
Question 08: Upcoming Dates Check
*/

import java.util.Scanner;
public class UpcomingDates{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Sunday is 0, Monday is 1, Tuesday is 2, Wednesday is 3, Thursday is 4, Friday is 5 and Saturday is 6");
		
        System.out.println("Enter day of the week (today)");
        int day = input.nextInt();

        System.out.print("Enter the number of days after today");
        int dayAfter = input.nextInt();

        int future = (day + dayAfter) % 7;

        String today = "";
        String futureDay = "";


        if(day == 0){
        	today = "Sunday";
        } 
        else if(day == 1){
        	today = "Monday";	
        }
        else if(day == 2){
        	today = "Tuesday";	
        }
        else if(day == 3){
        	today = "Wednesday";	
        }
        else if(day == 4){
        	today = "Thursday";	
        }
        else if(day == 5){
        	today = "Friday";	
        }
        else if(day == 6){
        	today = "Saturday";	
        }
        else{
        	System.out.print("Error! Again");	
        }




        if(future == 0){
        	futureDay = "Sunday";
        } 
        else if(future == 1){
        	futureDay = "Monday";	
        }
        else if(future == 2){
        	futureDay = "Tuesday";	
        }
        else if(future == 3){
        	futureDay = "Wednesday";	
        }
        else if(future == 4){
        	futureDay = "Thursday";	
        }
        else if(future == 5){
        	futureDay = "Friday";	
        }
        else if(future == 6){
        	futureDay = "Saturday";	
        }
        else{
        	System.out.print("Error! Again");	
        }


        System.out.print("Today is " + today + " and the future day is " + futureDay); 

	}
}
