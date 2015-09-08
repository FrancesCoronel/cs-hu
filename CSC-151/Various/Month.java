//FVCproductions
//March 27, 2014
//Switch Statements

import static java.lang.System.out; //importing System.out method
import java.util.Scanner; //importing Scanner method

public class Month {
	
	public static void main(String[] args) {
		
		//creating Scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		//asking user for month number
		
		out.print("Enter the number of the month: ");
		int month = keyboard.nextInt();
		
		//using switch statment for month number defined by user
		
		switch (month) {
			case 1:
				out.println("January");
				break; //gotta have your breaks in there
			case 2:
				out.println("Februrary"); //printing out month
				break;
			case 3:
				out.println("March");
				break;
			case 4:
				out.println("April");
				break;
			case 5:
				out.println("May");
				break;
			case 6:
				out.println("June");
				break;
			case 7:
				out.println("July");
				break;
			case 8:
				out.println("August");
				break;
			case 9:
				out.println("September");
				break;
			case 10:
				out.println("October");
				break;
			case 11:
				out.println("November");
				break;
			case 12:
				out.println("December");
				break;
			default:
				out.println("ERROR"); //default message set to error
				break;
		}
		
	}
}