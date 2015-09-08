//FVCproductions
//March 20, 2014

//importing Scanner method and System.out method

import static java.lang.System.out;
import java.util.Scanner;

public class TestResults2 {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in); //creating Scanner object
		
		//declaring necessary variables
		
		int input;
		String letter;
		
		//asking user for score and declaring it as input
	
		out.println("Enter your numeric test score and I will tell you the grade: ");
	
		input = keyboard.nextInt(); 
	
		TestGrade2 test = new TestGrade2(input); //creating object from Constructor
		
		letter = test.getLetterGrade(); //defining letter grade
		
		out.println();
		
		out.println("Your grade is " + letter); //printing out letter grade
	
	}
}