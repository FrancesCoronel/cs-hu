/*
FVCproductions
Array 2D
*/

import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args)  {
		
		Scanner keyboard = new Scanner(System.in); //creating Scanner to grab values from user
		
		double[][] table = new double[3][5]; //creating table with 3 rows and 5 columns
		
		System.out.println("Assign the values to each element in the array.");
		System.out.println();
		
		//asking user to assign values to each elements in array for each row and column using for loop
		
		for(int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[0].length; col++) {
				System.out.print("Enter Row " + (row+1) + " " + "Column " + (col+1) + ": ");
				table[row][col] = keyboard.nextDouble();
		    }
		}
		
		System.out.println();
		System.out.println("-----2D Array Before Changing Value-----");
		System.out.println();
		
		//printing out current values for table using for loop
		
		for (int rows = 0; rows < table.length; rows++) {
			for (int cols = 0; cols < table[0].length; cols++) {
				System.out.print(table[rows][cols] + "\t\t");
			}
			System.out.println();
		}
		
		//asking user to change value for element in table
		
		System.out.println();
		System.out.println("Now you will change the value of 1 element.");
		System.out.println();
		
		System.out.print("Which row do you want to change? "); //asking which row to change
		int row_choice = keyboard.nextInt();
		
		System.out.print("Which column do you want to change? "); //asking which column to change
		int column_choice = keyboard.nextInt();
		
		System.out.print("What is the new value you want to use? "); //asking what the new value the user wants to use
		double new_value = keyboard.nextDouble();
		
		table[row_choice - 1][column_choice - 1] = new_value; //asking new value to table
		
		System.out.println();
		System.out.println("-----2D Array After Changing Value-----"); 
		System.out.println();
		
		//printing 2D array after value is changed using for loop
		
		for (int rows = 0; rows < table.length; rows++) {
			for (int cols = 0; cols < table[0].length; cols++) {
				System.out.print(table[rows][cols] + "\t\t");
			}
			System.out.println();
		}
		
	}
}