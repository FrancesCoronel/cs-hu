//FVCproductions
//March 27, 2014
//Variable Declaration and Scope

import static java.lang.System.out; //importing System.out method
import java.util.Scanner; //importing Scanner method

public class MoreScope {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in); //creating Scanner object
	
		out.print("Enter your first name: "); //getting first name from user
		String firstName; //using variable scope here
		firstName = keyboard.nextLine();
		
		out.print("Enter your last name: "); //getting last name from user
		String lastName; //variable scope again
		lastName = keyboard.nextLine();
		
		out.println("Hello " + firstName + " " + lastName); //printing out hello message
		
	}
}