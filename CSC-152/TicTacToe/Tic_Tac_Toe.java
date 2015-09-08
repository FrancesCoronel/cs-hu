/***************************************************

fvcproductions

june 29 2014
 
simple tic tac toe program

****************************************************/

import java.util.Scanner;
import java.util.Random;

public class Tic_Tac_Toe {
	
	public static Scanner keyboard = new Scanner(System.in);
	final static int total_rows = 3; //declaring final variables makes it easier to change size if necessary
	final static int total_columns = 3;
	
	public static void main(String[] args) {
		
		char[][] Board = new char[total_rows][total_columns]; //creating game Board with 2D array not 1D array
		
		do { //do while loop for playAgain method
			
			System.out.print("Welcome to Tic-Tac-Toe\n"); //intro statement
			
			clearBoard(Board);
			printBoard(Board); //printing Board

			System.out.print("Do you want to be O or X ? "); //asking user if they want to be X or O
			
			//have to use special charAt methods due to character input
			char user_symbol = keyboard.next().toUpperCase().charAt(0);
			
			//assigning variable not chosen by user to computer
			char comp_symbol = (user_symbol == 'X') ? 'O' : 'X';
			
			System.out.println();
			
			System.out.println("Okay, so you want to be " + user_symbol + ", so the computer will be " + comp_symbol);
			
			System.out.println();
			
			//int = 0 for user, int = 1 for computer
			int turn;
			
			//empty cell count - idea found in textbook
			int remainCount = total_rows * total_columns;
			
			turn = 0; //user's turn!
			
	      	userTurn(Board, user_symbol); // user puts his/her first tic

			printBoard(Board); //show Board

			remainCount--; //decrement count of remaining calls
			
			boolean done = false; //play game until either one wins
			
			//  0 - user wins
			//  1 - computer wins
			// -1 - draw
			int winner = -1; 
			
			while (!done && remainCount > 0) {
				
				done = checkWin(Board, turn, user_symbol, comp_symbol); //if somebody won, set winner and done bool to true
				
				if (done) { //one who made last turn wins game 
					winner = turn; // the one who made the last move won the game
				}
				
				else {
					
					turn = (turn + 1 ) % 2; //else if done still false, play again
					
					if (turn == 0)
						userTurn(Board, user_symbol);
					else
						computerTurn(Board, comp_symbol);
					
					printBoard(Board); //show Board
					remainCount--; //decrement count of remaining calls
				
				}
				
				 
					
			}
			checkTie(Board, winner); //tie method printing who won, lost, or if tie
			
			//clearing Board for start of possible new game
			clearBoard(Board);
			
			System.out.println();
			
			System.out.print("Would you like to play again? Enter Y or N: ");
			playAgain(keyboard);
			
		} while (playAgain(keyboard).equals("Y"));
			
	}

	/* 
	---- ALL VARIOUS METHODS USED FOR GAME ----
	*/
	
	
	//playAgain method
	
	public static String playAgain(Scanner scanner) {
		
		String response = scanner.nextLine().toUpperCase();
		return response;
	
	}

	//clearing Board method

	public static void clearBoard(char[][] brd) {
		
		for (int i = 0; i < brd.length; i++)
			for (int j = 0; j < brd[0].length; j++)
				brd[i][j] = ' ';

	}

	//print Board method

	public static void printBoard(char[][] brd) {
		
		int numRow = brd.length;
		int numCol = brd[0].length;
		
		System.out.println();
		
		//printing column separators
		for (int i = 0; i < numRow; i++) {
			
			for (int j = 0; j < numCol; j++) {
				
				if (j != 0)
					System.out.print("|");
			
			System.out.print(" " + brd[i][j] + " ");
			
			}
			
			//new line for each row
			System.out.println();
			
			if (i != (numRow - 1)) {
			
			//printing row separators
			for (int j = 0; j < numCol; j++) {
				
				if (j != 0)
					System.out.print("+");
				
			System.out.print("---");
			
			}
			
			System.out.println();
	      	
			}
	    
		}
	    
		System.out.println();
		
	}

	//user Play method

	public static void userTurn(char[][] brd, char usym) {
		
		int single_input = 0;
		int all_good_user = 0;
		
		do {
			
			System.out.print("Human(" + usym + "): Enter a number from (1-9): ");
			single_input = keyboard.nextInt();
			
			if(brd[(single_input-1)/(total_rows)][(single_input - 1)%(total_columns)] == ' ') {
				brd[(single_input-1)/(total_rows)][(single_input - 1)%(total_columns)] = usym;
				all_good_user = 1;
			}
			else {
				System.out.println("That cell is already chosen! Try again.");
			}
			
		} while (all_good_user == 0);
		
		return;
		
	}


	//computer turn method

	public static void computerTurn(char[][] brd, char csym) {
		
		int comp_single_input = 0;
		int all_good_comp = 0;
		
		Random generator = new Random();
		
		do {
			
			comp_single_input = generator.nextInt(9)+1;
			
			System.out.println("Computer(" + csym + "): " + comp_single_input);
			
			if (brd[(comp_single_input-1)/(total_rows)][(comp_single_input - 1)%(total_columns)] == ' ') {
				brd[(comp_single_input-1)/(total_rows)][(comp_single_input - 1)%(total_columns)] = csym;
				all_good_comp = 1;
			}
			else {
				
				System.out.println("That cell is already chosen! Random another number");
			}
		
		} while (all_good_comp == 0);		
		
		return;
	}
	

	//checking if game is won
	//lots of if statments now...

	public static boolean checkWin(char[][] brd, int turn, char usym, char csym) {
		
		char sym;
		
		if (turn == 0) //user's turn
			sym = usym; //assigning user symbol
	    else //computer turn
	    		sym = csym; //assigning computer symbol
		
		int i, j;
		boolean win = false;
		
		//check win by row
		for (i = 0; i < brd.length && !win; i++) {
			for (j = 0; j < brd[0].length; j++) {
				if (brd[i][j] != sym)
					break;
	      	}

			if (j == brd[0].length)
				win = true;
	    }

	    //check win by column
		for (j = 0; j < brd[0].length && !win; j++) {
			for (i = 0; i < brd.length; i++) {	
				if (brd[i][j] != sym)
					break;
	      	}
			if (i == brd.length)
	        		win = true;
	    }

		//check win by 1st diagonal
		if (!win) {
			
			for (i = 0; i < brd.length; i++) {
				if (brd[i][i] != sym)
	          		break;
	      	}
	
			if (i == brd.length)
				win = true;
		}
		
		//check win by 2nd diagonal
		if (!win) {
			for (i = 0; i < brd.length; i++) {
				if (brd[i][brd.length - 1 - i] != sym)
					break;
		      }
		      
			if (i == brd.length)
				win = true;
		
		}

		//return win
		return win;

	}
	
	public static void checkTie(char[][] brd, int turn) {
		
		//if else statement stating if win, loss, or tie
		
		if (turn == 0) //user won
			System.out.println("Good for you! You won!");
		else if (turn == 1) //computer won
			System.out.println("Haha sucker, you lost! Better luck next time?");
		else //tie
			System.out.println("Looks like it was a tie");
		
		return;
	}

}

/* 
	
---- OUTPUT ----

Welcome to Tic-Tac-Toe

   |   |   
---+---+---
   |   |   
---+---+---
   |   |   

Do you want to be O or X ? o

Okay, so you want to be O, so the computer will be X

Human(O): Enter a number from (1-9): 1

 O |   |   
---+---+---
   |   |   
---+---+---
   |   |   

Computer(X): 9

 O |   |   
---+---+---
   |   |   
---+---+---
   |   | X 

Human(O): Enter a number from (1-9): 2

 O | O |   
---+---+---
   |   |   
---+---+---
   |   | X 

Computer(X): 1
That cell is already chosen! Random another number
Computer(X): 2
That cell is already chosen! Random another number
Computer(X): 8

 O | O |   
---+---+---
   |   |   
---+---+---
   | X | X 

Human(O): Enter a number from (1-9): 3

 O | O | O 
---+---+---
   |   |   
---+---+---
   | X | X 

Good for you! You won!

Would you like to play again? Enter Y or N:
N

*/
