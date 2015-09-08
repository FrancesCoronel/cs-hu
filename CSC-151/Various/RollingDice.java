//FVCproductions
//March 27, 2014
//Random Class with Rolling Die

import java.util.Random; //importing Random method
import static java.lang.System.out; //importing System.out method

class RollingDie {
	
	public static void main(String[] args) {
		
		int die1; //defining the two die
		int die2;
		
		Random rand = new Random(); //creating Random object
			
		out.println("Yeahhhh... rolling the dice...");
			
		die1 = rand.nextInt(6) + 1; //assigning random number interval to die1 and die2
			
		die2 = rand.nextInt(6) + 1;
			
		int sum = die1 + die2; //initializing/defining the sum to make it easier later
			
		out.println("Dice are " + die1 + " " + die2); //printing out values of die
		
		//if else statment that regulates game
		
		if (sum == 7 || sum == 11)
			out.println(sum + " natural");
		else if (sum == 2 || sum == 3 || sum == 12)
			out.println(sum + " craps");
		else
			out.println(sum + " point");
		
	}
}