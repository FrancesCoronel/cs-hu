//FVCproductions
//Getting Started

/*

Getting Started

	1. read 3 numbers from user using scanner (a, b, r)
	2. calculate 4 results
	3. result1 = a^6 - 9
	4. result2 = a^4-5ab+b^3
	5. result3 = ((3a-2)/(4)) + ((2b-1)/(8))
	6. result4 = ((4*r*5+2)/(3))
	7. print out all input values and results
	
*/

import java.util.Scanner; // importing Scanner method

public class GettingStarted {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); // creating Scanner object
		
		System.out.println("Hello there, welcome to my program! \n");
		
		// reading in int variables of a, b, and r by prompting user while defining them
		
		System.out.print("Please enter the number a : ");
		double a = keyboard.nextInt();
		
		System.out.println();
		
		System.out.print("Great, now enter the number b please : ");
		double b = keyboard.nextInt();
		
		System.out.println();
		
		System.out.print("Finally, please enter the number r : ");
		double r = keyboard.nextInt();
		
		// defining results 1 through 4 using Math power method
		
		double result1 = (Math.pow(a,6.0) - 9.0);
		double result2 = Math.pow(a,4.0) - 5.0*a*b + Math.pow(b,3.0);
		double result3 = ( ((3.0*a - 2.0)/(4.0)) + ((2.0*b-1.0)/(8.0)) );
		double result4 = ( (4.0*r*5.0 + 2.0)/(3.0) );
		
		System.out.println();
		
		// printing out values of a, b, and r
		
		System.out.println("Value a is equal to " + a); 
		System.out.println("Value b is equal to " + b);
		System.out.println("Value r is equal to " + r);
		
		System.out.println();
		
		// printing out results 1 through 4
		
		System.out.println("Result 1 is equal to " + result1);
		System.out.println("Result 2 is equal to " + result2);
		System.out.println("Result 3 is equal to " + result3);
		System.out.println("Result 4 is equal to " + result4);
		
		System.out.println();
		
		System.out.println("Thank you, come again.");
		
	}
}
