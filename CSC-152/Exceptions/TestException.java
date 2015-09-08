/***************************************************

fvcproductions

july 2012
 
testing an exception that was created

****************************************************/

import java.util.Scanner;

public class TestException {
	
	public static void main(String[] args) throws InvalidRectangleException {
		
		Scanner keyboard = new Scanner(System.in);
		
		int length, width;
		int counter = 0;
		
		System.out.println("Please enter length and width for myRectangle: ");
		
		do {
			
			length = keyboard.nextInt();
			width = keyboard.nextInt();
	
			try {
						
				//instanatiating objects
						
				Rectangle myRectangle = new Rectangle(length, width);
				
				System.out.println();
				System.out.println(myRectangle);
				
			} catch (InvalidRectangleException e) {
				
				System.out.println("\nERROR");
				System.out.println(e.getMessage());
				
				//more for developer debugging
				//e.printStackTrace();
				
				System.out.println();
				counter++;
				
				if (counter >= 3) {
					System.out.println("You already tried 3 times! Sorry.");
					break;
				}
				
				System.out.println("Please re-enter length and width for myRectangle: ");
				
			}
			
		} while (length <= 0 || width <= 0);		
		
		/*
		---Testing setLength() and setWidth()---
		---Declaring new Rectangle object called oRectangle---
		*/
		
		int oLength, oWidth;
		int oCounter = 0;
		
		Rectangle oRectangle = new Rectangle();
		
		System.out.println("\nPlease enter length and width for oRectangle: ");
		
		do {
				
			oLength = keyboard.nextInt();
			oWidth = keyboard.nextInt();

			try {
				
				oRectangle.setLength(oLength);
				oRectangle.setWidth(oWidth);
						
				System.out.println();
				System.out.println(oRectangle);
				
			} catch (InvalidRectangleException f) {
				
				System.out.println("\nERROR");
				System.out.println(f.getMessage());
				
				//more for developer debugging
				//e.printStackTrace();
				
				System.out.println();
				oCounter++;
				
				if (oCounter >= 3) {
					System.out.println("You already tried 3 times! Sorry.");
					break;
				}
				
				System.out.println("Please re-enter length and width for oRectangle: ");
				
			}
				
		} while (oLength <= 0 || oWidth <= 0);		
		
	}
}