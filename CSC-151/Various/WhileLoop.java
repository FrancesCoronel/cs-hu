//FVCproductions
//April 3, 2014
//While Loop

import java.util.Random; //importing Random method
import static java.lang.System.out; //importing System.out method

class WhileLoop {
	
	public static void main(String[] args) {
		
		int die1 = 0; //initializing the two die with 0
		int die2 = 0;
		
		Random rand = new Random(); //creating Random object
		
		int sum = 0; //initializing/defining the sum to make it easier later
		
		//while statment regulating die
		
		while (sum != 7) {
		
			die1 = rand.nextInt(6) + 1; //assigning random number interval to die1 and die2
			
			die2 = rand.nextInt(6) + 1;
			
			sum = die1 + die2;
		
		}
		
		out.println("Dice are " + die1 + " " + die2); //printing out values of die
		
		out.println();
			
		out.println("Seven rolled");
			
	}
}