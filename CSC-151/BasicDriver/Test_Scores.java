//FVCproductions
//Date: February 13, 2014

// importing Scanner object
import java.util.Scanner;

// creating driver
public class Test_Scores {

	public static void main (String[] args) {

		// defining all necessary variables
		String playerName;
		int expLevel;
		double score;

		// creating scanner object to read from keyboard
		Scanner keyboard = new Scanner(System.in);

		// creating player1 object
		Game player1 = new Game();

		// prompting user and reading in values for playerName, expLevel, score
		System.out.println("Welcome Player 1, what is your name?");
		playerName = keyboard.nextLine();

		System.out.println("Okay " + playerName + ", what is your expLevel?");
		expLevel = keyboard.nextInt();

		System.out.println("Finally " + playerName + ", what is your score?");
		score = keyboard.nextDouble();

		// calling calcScore
		player1.calcScore();
		player1.calcScore();

		// printing out state of objects for player 1
		System.out.println("Player 1 name: " + player1.getPlayerName());
		System.out.println("Player 1 experience level: " + player1.getExpLevel());
		System.out.println("Player 1 score: " + player1.calcScore());

		// creating player2 object
		Game player2 = new Game();

		String skip = keyboard.nextLine();

		System.out.println("Welcome Player 2, what is your name?");
		playerName = keyboard.nextLine();

		System.out.println("Okay " + playerName + ", what is your expLevel?");
		expLevel = keyboard.nextInt();

		System.out.println("Finally " + playerName + ", what is your score?");
		score = keyboard.nextDouble();

		// printin out state of objects for player 2
		System.out.println("Player 2 name: " + player1.getPlayerName());
		System.out.println("Player 2 experience level: " + player1.getExpLevel());
		System.out.println("Player 2 score: " + player1.calcScore());

		// defining string variable
		// length, uppercase, substrings
		String strLab = "My Laboratory 3";
		int strLab_len = strLab.length();
		String strLab_upper = strLab.toUpperCase();
		String strLab_rep = strLab.replace('o','@');

		// printing out string variables
		System.out.println("Length of string: " + strLab_len);
		System.out.println("Uppercase: " + strLab_upper);
		System.out.println("Changing all 'o' to '@': " + strLab_rep);
		System.out.println("Computer Architecture and Parallel Computing".substring(10,33));

		// math equations, defining variables
		double a = 16, b = 5, c = 7;
		double result1 = (2.0*Math.pow(b,2.0)-6.0*c)/(Math.sqrt(a));

		System.out.println("The result 1 is: " + result1);

	}
}