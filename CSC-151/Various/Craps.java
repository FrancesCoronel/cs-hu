//FVCproductions
//Date: April 3, 2014
//Featuring Craps, the dice game

import java.util.Random; //importing Random method
import static java.lang.System.out; //importing System.out method
import java.util.Scanner; //importing Scanner utility

class Craps {
	
	public static void main(String[] args) {
	
		int die1; //defining the two die
		int die2;
		int point = 0; //initializing point
		String repeat; //getting repeat for Yes or No question
		
		Scanner keyboard = new Scanner(System.in); //importing Scanner object
		
		Random rand = new Random(); //creating Random object
		
		do
		{
			
			die1 = rand.nextInt(6) + 1; //assigning random number interval to die1 and die2
			die2 = rand.nextInt(6) + 1;
			
			out.println("Dice are " + die1 + " " + die2); //printing out values of die
		
			//if else statment that regulates game
		
			if ((die1 + die2) == 7 || (die1 + die2) == 11)
				out.println((die1 + die2) + " natural");
			else if ((die1 + die2) == 2 || (die1 + die2) == 3 || (die1 + die2) == 12)
				out.println((die1 + die2) + " craps");
			else {
				point = die1 + die2;
				out.println((die1 + die2) + " point");
			}
			
			do
			{
			
				die1 = rand.nextInt(6) + 1; //assigning random number interval to die1 and die2
				die2 = rand.nextInt(6) + 1;
			
				out.println("Dice are " + die1 + " " + die2); //printing out values of die
				
				//if else if statment for other cases in game - declaring loser and winner
				
				if (die1 + die2 == 7)
					out.println("7 crap out");
				else if(die1+ die2 == point)
					out.println(point + " winner");
					
			} while ((die1 + die2) != point && (die1 + die2) != 7); //regulates workings of game
		
			out.println();
			
			//asking user if they want to play another game
		
			out.println("Would you like to play another game?");
			out.println("Enter Y for yes or N for no.");
			repeat = keyboard.nextLine();
		
		} while (repeat.equals("Y"));
		
	}
}