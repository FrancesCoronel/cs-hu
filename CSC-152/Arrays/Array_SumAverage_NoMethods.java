/***************************************************

fvcproductions

Purpose: this program is to read *7* integers and 
         calculate sum and average using arrays
         with no methods

****************************************************/

import java.util.Scanner;

public class Array_SumAverage_NoMethods {

	//Testing
	
	public static void main (String []args) {
		
		// define variables
		
		int sum = 0;
		int count = 0;
		
		double average;
		
		Scanner keyboard = new Scanner(System.in);
		
		//creating array with 7 defined as value
		
		int[] num_array = new int[7];
		
		// read 7 integers from keyboard
		
		System.out.println("You are to enter 7 numbers.");
		System.out.println();
		
		/*
		for loop that grabs the 7 numbers using array
		also calculates sum through count variable
		*/
		
		for (count = 0; count < 7; count++) {
			
			System.out.print("Enter number " + (count + 1) + ": ");
			num_array[count] = keyboard.nextInt(); 
			sum += num_array[count];
			
		}
		
		System.out.println();
		System.out.print("You entered the numbers: ");
		
		//for loop that prints out numbers within array
		
		for (int my_array: num_array) {
			System.out.print(my_array + " ");
		}
		
		System.out.println();
		
		// calculation
		
		average = (double) sum / 7 ;
		
		// results
		System.out.println();
		System.out.println("The sum of the 7 integers is : " + sum + "\n" +
                          "The average of the 7 integers is : " + average );
   
     
   }
}