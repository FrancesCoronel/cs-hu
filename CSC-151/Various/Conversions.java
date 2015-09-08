//fvcproductions

import java.util.Scanner; //importing scanner to read values from keyboard

public class Conversions {

   public static void main (String[] args) {
	
/*
### part1
- calculating sum and average of 5 pre-defined numbers
*/
	
		// defining 5 scores as doubles with random values

		double score1 = 90.0, score2 = 45.5, score3 = 79.0 , score4 = 32.8 , score5 = 89.0;
		double average = (score1+score2+score3+score4+score5)/5;
		
		// printing out scores and score average
		
		System.out.println("Score 1 is " + score1);
		System.out.println("Score 2 is " + score2);
		System.out.println("Score 3 is " + score3);
		System.out.println("Score 4 is " + score4);
		System.out.println("Score 5 is " + score5);
		
		System.out.println();
		
		System.out.println("Average of scores: " + average);
		
		System.out.println();
		
/*
### part2
- calculating sum and average of 5 user entered numbers
*/
		
		// defining scores and average variables 

		double myScore1, myScore2, myScore3, myScore4, myScore5;
		double myAverage;
		
		Scanner keyboard = new Scanner(System.in);
		
		// asking user to enter values

		System.out.println("Hello there, please enter Score 1: ");
		myScore1 = keyboard.nextDouble();
		
		System.out.println("Now please enter Score 2: ");
		myScore2 = keyboard.nextDouble();
		
		System.out.println("Now please enter Score 3: ");
		myScore3 = keyboard.nextDouble();
		
		System.out.println("Now please enter Score 4: ");
		myScore4 = keyboard.nextDouble();
		
		System.out.println("Now please enter Score 5: ");
		myScore5 = keyboard.nextDouble();
		
		// printing out average of scores entered by user

		myAverage = (myScore1 + myScore2 + myScore3+ myScore4 + myScore5)/(5);
		
		System.out.println();
		
		System.out.println("The average of the scores you entered is " + myAverage);
		
		System.out.println();
		
/*
### part3
- temperature conversion from fahrenheit to celsius
*/
		
		double fahrenheit;
		double celsius;
		
		System.out.println("Please enter a Fahrenheit temperature: ");
		fahrenheit = keyboard.nextDouble();
		
		celsius = (5.0/9.0)*(fahrenheit - 32);
		
		System.out.println("Your Fahrenheit temperature is: " + fahrenheit);
		System.out.println("Converted to Celsius, the temperature is: " + celsius);
		
/*
### part4
- string manipulation, reading in from keyboard
*/

		System.out.println();
		
		String myName;
		String myCity;
		String myState;
		
		String skip = keyboard.nextLine();
		
		System.out.println("Please enter your name: ");
		myName = keyboard.nextLine();
		
		
		System.out.println("Please enter your city: ");
		myCity = keyboard.nextLine();
		
		System.out.println("Please enter your state: ");
		myState = keyboard.nextLine();
		
		// printing out read in variables
		
		System.out.println();
		
		System.out.println("Name: " + myName);
		System.out.println("City: " + myCity);
		System.out.println("State: " + myState);
		
		// declaring string length variables and definining them
	
		int stringsize_myName = myName.length();
		int stringsize_myCity = myCity.length(); 
		int stringsize_myState = myState.length();
		
		// printing out string lengths
		
		System.out.println();
		
		System.out.println("String Length of my name: " + stringsize_myName);
		System.out.println("String Length of my city: " + stringsize_myCity);
		System.out.println("String Length of my state: " + stringsize_myState);
		
		// definng upper for string variables 
		
		String myUpper_myName = myName.toUpperCase();
		String myUpper_myCity = myCity.toUpperCase();
		String myUpper_myState = myState.toUpperCase();
		
		System.out.println();
		
		// printing out string variables in upper case
		
		System.out.println(myUpper_myName);
		System.out.println(myUpper_myCity);
		System.out.println(myUpper_myState);
		
		System.out.println();
		
		// defining lower for string variables
		
		String myLower_myName = myName.toLowerCase();
		String myLower_myCity = myCity.toLowerCase();
		String myLower_myState = myState.toLowerCase();
		
		// printing out string variables in lower case
		
		System.out.println(myLower_myName);
		System.out.println(myLower_myCity);
		System.out.println(myLower_myState);
		
		// defining and declaring char variables for each string variable
		
		char myLetter_myName = myName.charAt(0);
		char myLetter_myCity = myCity.charAt(0);
		char myLetter_myState = myState.charAt(0);
		
		// printing out first character for each string variable
		
		System.out.println();
		
		System.out.println(myLetter_myName);
		System.out.println(myLetter_myCity);
		System.out.println(myLetter_myState);
		
		// concatenate string variables of city and state
		
		String cityState = myCity + myState;
		
		System.out.println();
		
		System.out.println(cityState);
		
/*
### part5
- using math pow and math sqrt methods
*/
		
		double result1 = Math.pow(2,4);
		double result2 = Math.sqrt(36);
		
		// printing out math results
		
		System.out.println();
		
		System.out.println("2 raised to the power of 4 is " + result1);
		System.out.println("Squareroot of 36 is " + result2);
		
		// exploring 2 different kinds of string methods
		
		String string_method_1 = "abc".substring(2,3);
		String string_method_2 = "I don't like cats.";
		
		// printing out string methods
		
		System.out.println();
		
		System.out.println(string_method_1);
		System.out.println(string_method_2);
		
		}
}
		
		
		