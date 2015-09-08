/*
FVCproductions
Post Review
Exam 1
CSC 251
*/


import java.util.Scanner;

class PostReview_1 {
	
	public static void main(String[] args) {
		
		//1. create java code to store odd elements into array structure
		
		//create single dimensional array structure size 10 to hold integers
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		//create code that will store only odd elements
		//all positions must be filled with different odd numeric elements
		
		for (int i = 0; i < 10; i++) {
			if (array[i] % 2 == 0) {
				array[i] = array[i]+1;
			}
		}
		
		///////print array out
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n");
		
		//2. create java code that will search above array structure for particular element
		
		//prompt user for element to search for
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an element to search for: ");
		int element = keyboard.nextInt();
		
		
		for (int i = 0; i < 10; i++) {
		
			if (array[i] == element) {
				
				//printing out statement if element found
				
				System.out.println("Element was found.");
				
				break;
			
			}
				
			else {
			
				System.out.println("Element was not found.");
				
			}
			
		}
		
		//3. create java code that will search through array structure for partiuclar element and will print out # of occurences found
		
		//prompt user for element to search for
		
		System.out.print("Please enter an element to search for: ");
		element = keyboard.nextInt();
		
		//use for loop, explain why
		
		int count = 0;
		
		//for all elements in array
		
		for (int i = 0; i < 10; i++) {
			
			//if any element in array is equal to element given by user
		
			if (array[i] == element)
			
				//when element is found, number of occurences increases by one
				
				count++;
				
		}
		
		System.out.println("# of occurences for element: " + count);

	}
}
