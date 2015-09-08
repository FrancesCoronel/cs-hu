/***************************************************

fvcproductions

Purpose: this program reads *10* integers and
		 calculates sum and average in
		 separate methods

****************************************************/

import java.util.Scanner; // import scanner utility

public class Array_SumAverage {
	
	public static void main (String []args) {
	
		//creating scanner with scanner class
		
		Scanner keyboard = new Scanner(System.in);
		
		//creating array with 10 defined as value
		
		int[] num_array = new int[10];
		
		//specifying how many numbers are to be entered
		
		System.out.println("You are to enter 10 numbers.");
		System.out.println();
		
		//for loop that asks for 10 numbers one after the other
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			num_array[i] = keyboard.nextInt(); 
		}
		
		//stating which numbers were entered
		
		System.out.println();
		System.out.print("You entered the numbers: ");
		
		//for loop that prints out numbers within array
		
		for (int my_array: num_array) {
			System.out.print(my_array + " ");
		}
		
		System.out.println();
		
		System.out.println();
		
		// results printed out
		//sum, average, min, max
		
		System.out.println("The sum of the 10 integers is : " + findSum(num_array));
		System.out.println("The average of the 10 integers is : " + findAverage(num_array));
		System.out.println("The minimum value of the 10 integers is: " + findMin(num_array));
		System.out.println("The maximum value of the 10 integers is: " + findMax(num_array));
		
   }

//method that calculates maximum value using for loop

public static int findMax(int[] num_array) {  
    int max = num_array[0];  
	for(int i = 1; i < num_array.length; i++) {  
		if(num_array[i] > max){
			max = num_array[i];  
        }  
    }  
	return max;  
}  
  
//method that calculates minimum value using for loop

public static int findMin(int[] num_array) {  
	int min = num_array[0];
    for(int i = 1; i < num_array.length; i++) {  
		if(num_array[i] < min) {
			min= num_array[i];  
        }  
    }  
    return min;  
}

//method that calculates sum value using for loop

public static int findSum(int[] num_array) {
	int sum = 0;
	for (int i : num_array) {
		sum += i;		
	}
	return sum;
}

//method that calculates sum value using for loop

public static double findAverage(int[] num_array) {
	return ((double) (findSum(num_array)) / 10) ;
}

}